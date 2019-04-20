package com.example.everythingoktwo;

import android.animation.TimeInterpolator;
import android.graphics.Interpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button makeOkButton;
    public Text text;
    public ProgressBar;

    private static final TimeInterpolator ANIMATION_INTER = new DecelerateInterpolator(2);
    private static final int MAX_LEVEL = 100;
    private static final int DURATION = 7000;

    int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
