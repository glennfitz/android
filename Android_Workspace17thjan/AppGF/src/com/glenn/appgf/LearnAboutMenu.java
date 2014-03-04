package com.glenn.appgf;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LearnAboutMenu extends ListActivity {

	
	
	String learnMenuList[]={"Sound","Heat","Light","Magnetism","Electricity","Forces"};
	Class<?>targets[]= {Sound.class,Heat.class,Light.class,Magnetism.class,Electricity.class,Forces.class};	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);				
			setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, learnMenuList));
		}
		@Override
		protected void onListItemClick(ListView l, View v, int position, long id){		
			super.onListItemClick(l, v, position, id);
			Intent myIntent = new Intent(this, targets[position]);
			startActivity(myIntent);
		}	

	
	
	
	
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.learn_about_menu, menu);
		return true;
	}

}
