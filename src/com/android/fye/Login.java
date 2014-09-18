package com.android.fye;

import android.app.Activity;
//import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class Login extends Activity {

	Button button1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		//addListenerOnButton();

		button1 = (Button) findViewById(R.id.home);
	
	}

	public void onClick(View v) {
 		switch(v.getId()){
		 case R.id.home:
		    Intent intent1 = new Intent(getBaseContext(), Home.class);
		                startActivity(intent1);   
		break;
		
		}	
	}

}