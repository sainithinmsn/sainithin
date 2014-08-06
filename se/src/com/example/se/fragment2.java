package com.example.se;


import com.example.se.R;
import com.example.se.R.id;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment2 extends Fragment {
	TextView tv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.id.f2,container,false);
		
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		 tv=(TextView) getActivity().findViewById(R.id.textView1);
	}
	public void changetext(String data)
	{
		tv.setText(data);
	}

}
