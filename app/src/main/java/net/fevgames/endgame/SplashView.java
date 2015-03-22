package net.fevgames.endgame;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;


public class SplashView extends View {
    private static Bitmap bg = null;
    private static Bitmap logo = null;

    private Rect dstBG;
    private Rect dstLogo;
    private Rect srcBG;
    private Rect srcLogo;

    private final static float[] REGION_LOGO = {160/720.0f, 440/1280f, 560/720.0f, 840/1280.0f};
    private SplashActivity splashActivity;

    public SplashView(SplashActivity context) {
        super(context);
        this.splashActivity = context;
        if(bg == null) {
            bg = Util.getBitmapAlpha8(splashActivity, R.drawable.black);
        }
        srcBG = new Rect(0, 0, bg.getWidth(), bg.getHeight());
        if(logo == null) {
            logo = Util.getBitmapAlpha8(splashActivity, R.drawable.endgame);
        }
        srcLogo = new Rect(0, 0, logo.getWidth(), logo.getHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bg, srcBG, dstBG, null);
        canvas.drawBitmap(logo, srcLogo, dstLogo, null);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        dstBG = new Rect(0, 0, getWidth(), getHeight());
        dstLogo = new Rect(	(int)(getWidth()*REGION_LOGO[0]),
                (int)(getHeight()*REGION_LOGO[1]),
                (int)(getWidth()*REGION_LOGO[2]),
                (int)(getHeight()*REGION_LOGO[3]));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        performClick();
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            if(	(event.getX() > REGION_LOGO[0] * getWidth())
                    && (event.getX() < REGION_LOGO[2] * getWidth())
                    && (event.getY() > REGION_LOGO[1] * getHeight())
                    && (event.getY() < REGION_LOGO[3] * getHeight()) ) {
                splashActivity.startActivity(new Intent("net.fevgames.endgame.MainActivity"));
                splashActivity.finish();
            }
        }
        return true;
    }
}
