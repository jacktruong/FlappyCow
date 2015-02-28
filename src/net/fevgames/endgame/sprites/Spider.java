/**
 * A spider with web
 * 
 * BTW Spiders have 8 eyes.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */
package net.fevgames.endgame.sprites;

import net.fevgames.endgame.Game;
import net.fevgames.endgame.GameView;
import net.fevgames.endgame.R;
import net.fevgames.endgame.Util;

import android.graphics.Bitmap;

public class Spider extends Sprite {
	
	/**
	 * Static bitmap to reduce memory usage.
	 */
	public static Bitmap globalBitmap;

	public Spider(GameView view, Game game) {
		super(view, game);
		if(globalBitmap == null){
			globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.spider_full);
		}
		this.bitmap = globalBitmap;
		this.width = this.bitmap.getWidth();
		this.height = this.bitmap.getHeight();
	}
	
	/**
	 * Sets the position
	 * @param x
	 * @param y
	 */
	public void init(int x, int y){
		this.x = x;
		this.y = y;
	}

}