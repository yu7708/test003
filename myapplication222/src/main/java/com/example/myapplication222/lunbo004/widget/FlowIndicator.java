package com.example.myapplication222.lunbo004.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 余 on 2017/5/15.
 */

public class FlowIndicator extends View{
    int mCount;
    int mRadius;
    int mSpace;
    int mNormalColor;
    int mFoucsColor;
    int mFocus;
    Paint mPaint;
    public void setmCount(int mCount) {
        this.mCount = mCount;
        requestLayout();
    }

    public int getmFocus() {
        return mFocus;
    }

    public void setmFocus(int mFocus) {
        this.mFocus = mFocus;
        invalidate();
    }

    public FlowIndicator(Context context) {
        super(context);
    }

    public FlowIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
