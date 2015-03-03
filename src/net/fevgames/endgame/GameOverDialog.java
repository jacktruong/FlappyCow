/**
 * The dialog shown when the game is over
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package net.fevgames.endgame;

import android.app.Dialog;
//import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverDialog extends Dialog {
	
	/** The game that invokes this dialog */
	private Game game;
	
	private TextView tvCurrentScoreVal;

	public GameOverDialog(Game game) {
		super(game);
		this.game = game;
		this.setContentView(R.layout.gameover);
		this.setCancelable(false);
		
		tvCurrentScoreVal = (TextView) findViewById(R.id.tv_current_score_value);
	}
	
	public void init(){
		Button okButton = (Button) findViewById(R.id.b_ok);
		okButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dismiss();
				game.finish();
			}
		});

		Button reviveButton = (Button) findViewById(R.id.b_revive);
		reviveButton.setText(game.getResources().getString(R.string.revive_button));
		reviveButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dismiss();
				game.view.revive();
			}
		});
		manageScore();
	}
	
	private void manageScore(){
		tvCurrentScoreVal.setText("" + game.accomplishmentBox.points);
	}
	
}
