package com.example.se;

import com.example.se.R;
import com.example.se.communicator;
import com.example.se.R.id;

import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment implements View.OnClickListener{
	Button b;
	communicator com;
	int i=0;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.id.f1 ,container,false);
		
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
      com=(communicator) getActivity();
      b=(Button) getActivity().findViewById(R.id.button1);
      b.setOnClickListener(this);
      
	}

@Override
public void onClick(View view) {
	// TODO Auto-generated method stub
	i++;
	com.respond("button is clicked "+i+" times");
	
	
}
	

}
