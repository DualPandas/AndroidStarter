package com.android.fye;

import android.app.Activity;
//import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class Home extends Activity {

	Button button1, button2, button3, button4;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		//addListenerOnButton();

		button1 = (Button) findViewById(R.id.schedule);
		button2 = (Button) findViewById(R.id.teams);
		button3 = (Button) findViewById(R.id.alerts);
		button4 = (Button) findViewById(R.id.settings);
	}

	public void onClick(View v) {
 		switch(v.getId()){
		 case R.id.schedule:
		    Intent intent1 = new Intent(getBaseContext(), Schedule.class);
		                startActivity(intent1);   
		break;
		case R.id.teams:
			Intent intent2 = new Intent(Home.this, Teams.class);
		        startActivity(intent2);  
		break;
		case R.id.alerts:
			Intent intent3 = new Intent(Home.this, Alerts.class);
		        startActivity(intent3);  
		break;
		case R.id.settings:
			Intent intent4 = new Intent(Home.this, Settings.class);
		        startActivity(intent4);  
		break;
		}	
	}

}