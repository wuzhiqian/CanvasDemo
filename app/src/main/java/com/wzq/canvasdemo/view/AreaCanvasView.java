package com.wzq.canvasdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;

/**
 * Created by wzq on 17-1-6.
 */

public class AreaCanvasView extends BasicView {
    public AreaCanvasView(Context context) {
        this(context, null);
    }

    public AreaCanvasView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AreaCanvasView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, new Rect(30, 30, bitmap.getWidth() - 30, bitmap.getHeight() - 30), new Rect(30, 30, bitmap.getWidth() -30, bitmap.getHeight() - 30), paint);

    }
}
