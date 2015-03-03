/**
 * Main Activity / Splashscreen with buttons.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package net.fevgames.endgame;

import com.google.android.gms.games.GamesClient;
import com.google.example.games.basegameutils.BaseGameActivity;

import android.os.Bundle;

public class MainActivity extends BaseGameActivity {
	
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
    
    public GamesClient getGamesClient() {
    	return this.mHelper.getGamesClient();
    }
    
    public void login() {
    }
    
    public void logout() {
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

	@Override
	public void onSignInFailed() {
	}

	@Override
	public void onSignInSucceeded() {
	}
    
}
