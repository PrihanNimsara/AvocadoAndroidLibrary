package com.prihanofficial.avocado.helpers;


import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Prihan Nimsara on 6/22/2017.
 **/

public class AvocadoTextView extends TextView {
    public AvocadoTextView(Context context) {
        super(context);
    }

    public AvocadoTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AvocadoTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AvocadoTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
