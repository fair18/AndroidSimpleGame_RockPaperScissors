package com.yborisjuk.labrps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn_beginGame;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn_beginGame = (Button) findViewById(R.id.btn_beginGame);

		btn_beginGame.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent selectActivity = new Intent(getApplicationContext(),
						SelectorActivity.class);
				selectActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(selectActivity);
				finish();

			}
		});
	}
}
