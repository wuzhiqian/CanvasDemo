package com.wzq.canvasdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/**
 * Created by wzq on 17-1-6.
 */

public class SimpleCanvasView extends BasicView{


    public SimpleCanvasView(Context context) {
        this(context, null);
    }

    public SimpleCanvasView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleCanvasView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, 64, 30, paint);

    }
}
