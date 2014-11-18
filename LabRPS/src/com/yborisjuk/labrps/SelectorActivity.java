package com.yborisjuk.labrps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectorActivity extends Activity {
	
	private ListView listView;
	private String array_game[];
	private ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selector);
		
		listView = (ListView) findViewById(R.id.ls_selector);
		
		array_game = getResources().getStringArray(R.array.game);
		adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.game_list, array_game);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(itemClickListener);
	}
	OnItemClickListener itemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			String i = parent.getItemAtPosition(position).toString();
			Intent intent = new Intent(getApplicationContext(),GameActivity.class);
			intent.putExtra("your_choice", i);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivityForResult(intent, 1);
			finish();
		}
	};
	
}
