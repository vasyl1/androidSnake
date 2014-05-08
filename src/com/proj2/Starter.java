package com.proj2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Build;

public class Starter extends ListActivity {

	String tests[] = { "LifeCycleTest", "SingleTouchTest", "MultiTouchTest",
			"KeyTest", "AccelerometerTest", "AssetsTest",
			"ExternalStorageTest", "SoundPoolTest", "MediaPlayerTest",
			"FullScreenTest", "RenderViewTest", "ShapeTest", "BitmapTest",
			"FontTest", "SurfaceViewTest" };
			 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, tests));
	}
	
			
	protected	void onListItemClick (ListView list, View view, int position, long id) {
		super.onListItemClick(list, view, position, id);
		String testName = tests[position];
		try {
			Class clazz = Class
					.forName("com.proj2." + testName);
			Intent intent = new Intent(this, clazz);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
			

}
