package net.fevgames.endgame;

import android.app.Activity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    private SplashView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new SplashView(this);
        setContentView(view);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
