package com.main.daily_question;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class MainActivity_Homescreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity__homescreen);
		
		Button btn_Start = (Button) findViewById (R.id.btn_Start);
		btn_Start.setOnClickListener(new OnClickListener(){
			
				public void onClick(View v){
					
					Intent intent = new Intent(v.getContext(), Questionbar.class);					
					startActivityForResult (intent, 0);
				}
			
			
		});
		
		Button btn_Settings = (Button) findViewById (R.id.btn_Settings);
		
		btn_Settings.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				Intent intent = new Intent (v.getContext(), Settings.class);
				startActivityForResult(intent, 0);				
			}
		});
		
		
	}



}
