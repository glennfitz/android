package com.glenn.appgf;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String menuList [] = {"View_Planets","Learn_About","Email","Visit BCO",};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);				
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, menuList));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){		
		
		super.onListItemClick(l, v, position, id);
		String pos = menuList[position];
		try{
		Class myClass = Class.forName("com.glenn.appgf." + pos);
		Intent myIntent = new Intent(Menu.this, myClass);
		startActivity(myIntent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}
	}
}
