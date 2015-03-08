package com.example.bai_12_menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnOption, btnContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bai11_activity_main);

		btnOption = (Button) findViewById(R.id.btnOptionMenu);
		btnContext = (Button) findViewById(R.id.btnContextMenu);

		btnOption.setOnClickListener(this);
		btnContext.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnOptionMenu:
			Intent intent = new Intent(getApplicationContext(),
					OptionMenu.class);
			startActivity(intent);
			break;
		case R.id.btnContextMenu:
			Intent intent2 = new Intent(getApplicationContext(),
					ContextMenu.class);
			startActivity(intent2);
			break;
		default:
			break;
		}

	}
}
