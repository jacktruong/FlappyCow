/**
 * Saves achievements and score in shared preferences.
 * You should use a SQLite DB instead, but I'm too lazy to chance it now.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package net.fevgames.endgame;

import android.app.Activity;
import android.content.SharedPreferences;

public class AccomplishmentBox{
	/** Points needed for a gold medal */
	public static final int GOLD_POINTS = 100;
	
	/** Points needed for a silver medal */
	public static final int SILVER_POINTS = 50;
	
	/** Points needed for a bronze medal */
	public static final int BRONZE_POINTS = 10;
	
	public static final String SAVE_NAME = "ACCOMBLISHMENTS";
	
	public static final String ONLINE_STATUS_KEY = "online_status";
	
	public static final String KEY_POINTS = "points";
	public static final String ACHIEVEMENT_KEY_50_COINS = "achievement_survive_5_minutes";
	public static final String ACHIEVEMENT_KEY_TOASTIFICATION = "achievement_toastification";
	public static final String ACHIEVEMENT_KEY_BRONZE = "achievement_bronze";
	public static final String ACHIEVEMENT_KEY_SILVER = "achievement_silver";
	public static final String ACHIEVEMENT_KEY_GOLD = "achievement_gold";
	
	int points;
	boolean achievement_50_coins;
	boolean achievement_toastification;
	boolean achievement_bronze;
	boolean achievement_silver;
	boolean achievement_gold;
	
	/**
	 * Stores the score and achievements locally.
	 * 
	 * The accomblishments will be saved local via SharedPreferences.
	 * This makes it very easy to cheat.
	 * 
	 * @param outbox Data that should be saved
	 * @param activity activity that is needed for shared preferences
	 */
	public void saveLocal(Activity activity){
		SharedPreferences saves = activity.getSharedPreferences(SAVE_NAME, 0);
		SharedPreferences.Editor editor = saves.edit();
		
		if(points > saves.getInt(KEY_POINTS, 0)){
			editor.putInt(KEY_POINTS, points);
		}
		if(achievement_50_coins){
			editor.putBoolean(ACHIEVEMENT_KEY_50_COINS, true);
		}
		if(achievement_toastification){
			editor.putBoolean(ACHIEVEMENT_KEY_TOASTIFICATION, true);
		}
		if(achievement_bronze){
			editor.putBoolean(ACHIEVEMENT_KEY_BRONZE, true);
		}
		if(achievement_silver){
			editor.putBoolean(ACHIEVEMENT_KEY_SILVER, true);
		}
		if(achievement_gold){
			editor.putBoolean(ACHIEVEMENT_KEY_GOLD, true);
		}
		
		editor.commit();
	}
	
}