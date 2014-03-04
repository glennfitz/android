package com.glenn.appgf;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Planets_Menu extends ListActivity{

String planetMenuList[]={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
Class<?>targets[]= { Mercury.class,Venus.class,Earth.class,Mars.class,Jupiter.class,Saturn.class,Uranus.class,Neptune.class};	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);				
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planetMenuList));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){		
		super.onListItemClick(l, v, position, id);
		Intent myIntent = new Intent(this, targets[position]);
		startActivity(myIntent);
	}	
}
