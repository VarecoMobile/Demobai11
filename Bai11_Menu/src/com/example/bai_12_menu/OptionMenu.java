package com.example.bai_12_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bai11_activity_option_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bai11_option_menu, menu);// Menu Resource,
															// Menu
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.item1:
			Toast.makeText(getApplicationContext(), "Item 1 Selected",
					Toast.LENGTH_LONG).show();
			return true;
		case R.id.item2:
			Toast.makeText(getApplicationContext(), "Item 2 Selected",
					Toast.LENGTH_LONG).show();
			return true;
		case R.id.item3:
			Toast.makeText(getApplicationContext(), "Item 3 Selected",
					Toast.LENGTH_LONG).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
