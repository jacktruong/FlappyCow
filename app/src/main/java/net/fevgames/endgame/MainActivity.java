/**
 * Main Activity / Splashscreen with buttons.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package net.fevgames.endgame;

import android.app.Activity;

import android.os.Bundle;

public class MainActivity extends Activity {
	
	public static final float DEFAULT_VOLUME = 0.3f;
	
	/** Volume for sound and music */
	public static float volume = DEFAULT_VOLUME;
	
	private StartscreenView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new StartscreenView(this);
        setContentView(view);
    }
    
    public void muteToggle() {
    	if(volume != 0){
			volume = 0;
			view.setSpeaker(false);
		}else{
			volume = DEFAULT_VOLUME;
			view.setSpeaker(true);
		}
    	view.invalidate();
    }
    
	/**
	 * Updates the socket for the medals.
	 */
	@Override
	protected void onResume() {
		super.onResume();
	}

}
