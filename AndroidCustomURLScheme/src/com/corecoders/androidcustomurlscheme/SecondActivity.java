package com.corecoders.androidcustomurlscheme;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*if passed url is like "http://www.corecoders.androidcustomurlscheme.com/aromalhere/aromal
		
		then  getPathSegments() gives array[aromalhere,aromal]
		
		array[0] => aromalhere
		
		array[1] => aromal
		
		
		
		
		*/
		
		Log.e("TAG HERE","DATA FROM URI "+getIntent().getData().getPathSegments());
		
		
		
	}
}
