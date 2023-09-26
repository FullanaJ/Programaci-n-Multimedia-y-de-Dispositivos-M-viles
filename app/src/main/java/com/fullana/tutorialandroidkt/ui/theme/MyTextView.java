package com.fullana.tutorialandroidkt.ui.theme;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyTextView extends TextView {

    Button button;

    public MyTextView(Button view) {
        super(view.getContext());
        this.button = view;
    }

}
