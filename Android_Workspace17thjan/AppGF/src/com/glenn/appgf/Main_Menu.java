package com.glenn.appgf;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main_Menu extends ListActivity{
	
	
	String mainMenuList [] = {"View Planets","Learn About","Test your knowledge","Visit BCO"};
	Class<?> targets[] = { Planets_Menu.class, LearnAboutMenu.class, LearnAboutMenu.class};

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);				
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mainMenuList));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){		
		super.onListItemClick(l, v, position, id);
		Intent myIntent;
		if (position == 3) {
			myIntent = new Intent(Intent.ACTION_VIEW);
			Uri u = Uri.parse("http://www.bco.ie/");
			myIntent.setData(u);
		} else {
			myIntent = new Intent(this, targets[position]);
		}
		startActivity(myIntent);
	}
}
