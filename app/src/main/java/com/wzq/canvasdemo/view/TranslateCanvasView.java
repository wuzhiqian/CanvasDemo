package com.wzq.canvasdemo.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.AttributeSet;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by wzq on 17-1-6.
 */

public class TranslateCanvasView extends BasicView {


    float translateX = 0;
    float scale = 1;
    float rotate = 0;
    float skew = 0;
    Random rn;

    Handler handler;

    public TranslateCanvasView(Context context) {
        this(context, null);
    }

    public TranslateCanvasView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TranslateCanvasView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        rn = new Random();
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (translateX >= 400) {
                    translateX = 0;
                }
                translateX++;
                translateX = 100;
                rotate ++;
                if(rotate >= 360)
                    rotate = 0;
                skew ++;
                if(skew > 100)
                    skew = 0;
             //   scale = rn.nextInt(100) / 50.0f;
                setTranslationX(translateX);
                setScaleX(scale);
                setScaleY(scale);
                setRotation(rotate);
               // invalidate();
                postDelayed(this, 10);
            }
        }, 10);

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, translateX, 100, paint);
        }

    }
}
