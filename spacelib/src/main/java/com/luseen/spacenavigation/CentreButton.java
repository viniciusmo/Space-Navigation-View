package com.luseen.spacenavigation;

import android.content.Context;
import android.widget.RelativeLayout;

/**
 * Created by Chatikyan on 10.11.2016.
 */

public class CentreButton extends RelativeLayout {

    public CentreButton(Context context) {
        super(context);
        inflate(context, R.layout.custom_oval_button, this);
    }
}
