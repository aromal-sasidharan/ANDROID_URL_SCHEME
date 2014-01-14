package com.corecoders.androidcustomurlscheme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
	public void sendEmail(View v) {

		
		
	
		String html = "<a href='app.myscheme.content://www.google.com/terms.html'>terms and conditons</a>";
	
		Spanned htmlSpanned = Html.fromHtml(html);
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("text/html");
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
				new String[] {});
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"New Puzzle on PhotoGuessaroo!");
		
		
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				htmlSpanned);
		
		
		emailIntent.putExtra("exit_on_sent", true);
		// emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(imageUrl));
		startActivityForResult(
				Intent.createChooser(emailIntent, "Send mail..."),
				3454345);
		
		
		System.out.println(htmlSpanned);
	}
	
	public void sendSMS(View V) {

		long a= 94473022779L;
		Uri uri = Uri.parse("smsto:"+a);
		Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
		
		String html = "http://www.corecoders.androidcustomurlscheme.com/aromalhere/aromal";
		
	
		intent.putExtra("sms_body", html);
		intent.putExtra("exit_on_sent", true);
		startActivityForResult(intent, 435345);
	}


}
