package com.yborisjuk.labrps;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends Activity {
	
	private TextView txt_choice, txt_result;
	private Button btn_startGame, btn_exit;
	private String player, computer;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		txt_choice = (TextView) findViewById(R.id.txt_choice);
		txt_result = (TextView) findViewById(R.id.txt_result);
		btn_startGame = (Button) findViewById(R.id.btn_startGame);
		btn_exit = (Button) findViewById(R.id.btn_exit);
		
		btn_startGame.setOnClickListener(clickListener);
		btn_exit.setOnClickListener(clickListener);
		
		
		
		
	}
	
	OnClickListener clickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			switch (v.getId()) {
			case R.id.btn_startGame: {
				Random random = new Random();
				int r = random.nextInt(4 - 1) + 1;
				computer = computerChoice(r);
				player = getIntent().getStringExtra("your_choice");
				
				gameRockPaperScissor(player, computer);
			}
				break;
			case R.id.btn_exit: {
				Intent mainIntent = new Intent(getApplicationContext(),MainActivity.class);
				mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(mainIntent);
				finish();
			}
				break;
			}
		}

		private void gameRockPaperScissor(String player, String computer) {
			if (player.equals(computer)) {
				txt_result.setText("The result is tie!");
			} else if (player.contains("rock")){
					if (computer.contains("scissors")) {
						txt_result.setText(getResources().getString(R.string.txt_result_win));
					} else {
						txt_result.setText(getResources().getString(R.string.txt_result_lose));
					}
			} else if (player.contains("paper")) {
				if (computer.contains("rock")) {
					txt_result.setText(getResources().getString(R.string.txt_result_win));
				} else {
					txt_result.setText(getResources().getString(R.string.txt_result_lose));
				}
			} else if (player.contains("scissors")) {
				if (computer.contains("paper")) {
					txt_result.setText(getResources().getString(R.string.txt_result_win));
				} else {
					txt_result.setText(getResources().getString(R.string.txt_result_lose));
				}
			}
			
		}

		private String computerChoice(int r) {
			String result; 
			if (r == 1) {
				result = "rock";
				txt_choice.setText(getResources().getString(R.string.txt_choice_rock));
			} else if (r == 2) {
				result = "paper";
				txt_choice.setText(getResources().getString(R.string.txt_choice_paper));
			} else {
				result = "scissors";
				txt_choice.setText(getResources().getString(R.string.txt_choice_scissors));
			}
			return result;
		}
	};
	
}
