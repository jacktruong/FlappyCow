/**
 * Manages the bitmap at the front
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

public class Frontground extends Background {
	/**
	 * Height of the ground relative to the height of the bitmap
	 */
	public static final float GROUND_HEIGHT = (1f * /*45*/ 35) / 720;

	/**
	 * Static bitmap to reduce memory usage.
	 */
	public static Bitmap globalBitmap;
	
	public Frontground(GameView view, Game game) {
		super(view, game);
		if(globalBitmap == null){
			globalBitmap = Util.getDownScaledBitmapAlpha8(game, R.drawable.fg);
		}
		this.bitmap = globalBitmap;
	}
	
}
