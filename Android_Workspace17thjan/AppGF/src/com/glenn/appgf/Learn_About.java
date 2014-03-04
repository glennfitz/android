package com.glenn.appgf;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Learn_About extends Activity implements View.OnClickListener{

	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn);
		
		wigit_Items();
		
		passTog.setOnClickListener(this);		
		chkCmd.setOnClickListener(this);
	}
	private void wigit_Items() {
		chkCmd = (Button)findViewById(R.id.bResults);
		passTog = (ToggleButton)findViewById(R.id.tbPassword);
		input = (EditText)findViewById(R.id.etCommands);
		display = (TextView)findViewById(R.id.tvResults);
	}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.bResults:
			String check = input.getText().toString();			
			
			if(check.contentEquals("left") ){
				display.setGravity(Gravity.LEFT);
			}
			else if(check.contentEquals("center")){
				display.setGravity(Gravity.CENTER);
			}
			else if(check.contentEquals("right")){
				display.setGravity(Gravity.RIGHT);
			}
			else if(check.contentEquals("blue")){
				display.setTextColor(Color.BLUE);
			}
			else if(check.contentEquals("WTF")){
				Random rand = new Random();
				display.setText("WTF");
				display.setTextSize(rand.nextInt(100));
				display.setTextColor(Color.rgb(rand.nextInt(265),rand.nextInt(265),rand.nextInt(265)));
				
				switch(rand.nextInt(3)){
				case 0:
					display.setGravity(Gravity.LEFT);
					break;
				case 1:
					display.setGravity(Gravity.CENTER);
					break;						
				case 2:
					display.setGravity(Gravity.RIGHT);
					break;
				
				}
			}
			else{
				display.setText("invalid");
				display.setGravity(Gravity.CENTER);
				display.setTextColor(Color.CYAN);
			}
			break;
			
		case R.id.tbPassword:
			if(passTog.isChecked()){					
				input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}
			else{
				input.setInputType(InputType.TYPE_CLASS_TEXT);	
			}
			break;
		
		}
		
	}	
	
}
