package cn.com.jdsc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CarFragment extends Fragment{
	
	private Button btn_go;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		System.out.println("CarFragment");
		View view = inflater.inflate(R.layout.main_car, container, false);		
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		btn_go = (Button) getActivity().findViewById(R.id.settle_accounts);
		btn_go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "按钮被点击了", Toast.LENGTH_SHORT).show();
				MainActivity mainActivity = (MainActivity) getActivity();
				mainActivity.setFragment2Fragment(new MainActivity.Fragment2Fragment() {
					
					@Override
					public void gotoFragment(ViewPager viewPager) {
						// TODO Auto-generated method stub
						viewPager.setCurrentItem(1);
					}
				});
				mainActivity.forSkip();
				
			}
		});
	}
	
	
}
