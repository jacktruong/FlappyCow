/**
 * A yummy toast
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package com.nianticproject.endgame.sprites;

import com.nianticproject.endgame.Game;
import com.nianticproject.endgame.GameView;
import com.nianticproject.endgame.R;
import com.nianticproject.endgame.Util;

import android.graphics.Bitmap;

public class Toast extends PowerUp {
	
	/**
	 * Static bitmap to reduce memory usage.
	 */
	public static Bitmap globalBitmap;

	public Toast(GameView view, Game game) {
		super(view, game);
		if(globalBitmap == null){
			globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.toast);
		}
		this.bitmap = globalBitmap;
		this.width = this.bitmap.getWidth();
		this.height = this.bitmap.getHeight();
	}

	/**
	 * When eaten the player will turn into nyan cat.
	 */
	@Override
	public void onCollision() {
		super.onCollision();
		view.changeToNyanCat();
	}
	
	
}
