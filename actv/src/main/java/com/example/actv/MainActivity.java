package com.example.actv;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	private static final String[] items = {
		"1234",
		"2345",
		"3456",
		"4567"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.auto_complete_test);
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
		actv.setAdapter(adapter);
		actv.setThreshold(1);
	}
}
