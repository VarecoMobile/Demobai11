package com.example.bai_12_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContextMenu extends Activity {

	private Button btnshow;
	MenuItem item;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bai11_activity_context_menu);

		btnshow = (Button) findViewById(R.id.btnct);
		registerForContextMenu(btnshow);

	}

	@Override
	public void onCreateContextMenu(android.view.ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		getMenuInflater().inflate(R.menu.bai11_my_context_menu, menu);
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.itemRed:
			btnshow.setTextColor(getResources().getColor(R.color.clrred));
			break;
		case R.id.itemGreen:
			btnshow.setTextColor(getResources().getColor(R.color.clrgreen));
			break;
		case R.id.itemBlue:
			btnshow.setTextColor(getResources().getColor(R.color.clrblue));
			break;
		}
		return super.onContextItemSelected(item);

	}
}
