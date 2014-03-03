package com.glenn.appgf;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

	MediaPlayer mySound;
	@Override
	protected void onCreate(Bundle splashBundle){

		super.onCreate(splashBundle);
		setContentView(R.layout.splash);		
		mySound = MediaPlayer.create(Splash.this, R.raw.splashwelcome);		
		mySound.start();
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);

				}catch(InterruptedException e) {
					e.printStackTrace();
				}				
				finally{
					Intent theMainMenu = new Intent("com.glenn.appgf.MENU");
					startActivity(theMainMenu);
				}				
			}			
		};

		timer.start();	}

	@Override
	protected void onPause() {
		super.onPause();
		mySound.release();
		finish();// killing the splash screen here 
	}

}
