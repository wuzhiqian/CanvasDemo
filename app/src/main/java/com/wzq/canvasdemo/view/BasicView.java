package com.wzq.canvasdemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.wzq.canvasdemo.R;

/**
 * Created by wzq on 17-1-6.
 */

public class BasicView extends View{
    protected Bitmap bitmap;
    protected Paint paint;
    public BasicView(Context context) {
        this(context, null);
    }

    public BasicView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BasicView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.a);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
    }




}
