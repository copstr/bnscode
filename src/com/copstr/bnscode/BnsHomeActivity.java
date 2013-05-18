package com.copstr.bnscode;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BnsHomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bns_home);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bns_home, menu);
		return true;
	}
}
