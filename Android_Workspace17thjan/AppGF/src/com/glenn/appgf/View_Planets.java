package com.glenn.appgf;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class View_Planets extends Activity {

	Button mercuryB;
	Button venusB;
	Button earthB;
	Button marsB;
	Button jupiterB;
	Button saturnB;
	Button uranusB;
	Button neptuneB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_planets);

		mercuryB = (Button) findViewById(R.id.mercury_btn);
		venusB = (Button) findViewById(R.id.venus_btn);
		earthB = (Button) findViewById(R.id.earth_btn);
		marsB = (Button) findViewById(R.id.mars_btn);
		jupiterB = (Button) findViewById(R.id.jupiter_btn);
		saturnB = (Button) findViewById(R.id.saturn_btn);
		uranusB = (Button) findViewById(R.id.uranus_btn);
		neptuneB = (Button) findViewById(R.id.neptune_btn);
		
		
		
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.starting_point, menu);
		return true;
	}
}
