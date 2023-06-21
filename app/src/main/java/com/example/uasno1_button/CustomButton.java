package com.example.uasno1_button;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import java.util.Random;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton{
    public boolean isButtonClicked = true;

    private void init() {
        setBackgroundColor(getResources().getColor(R.color.pink));
        setTextColor(Color.BLACK);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isButtonClicked == true){
                    setBackgroundColor(getResources().getColor(R.color.yellow));
                    isButtonClicked = false;
                }
                else{
                    setBackgroundColor(getResources().getColor(R.color.pink));
                    isButtonClicked = true;
                }
            }
        });
    }

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
