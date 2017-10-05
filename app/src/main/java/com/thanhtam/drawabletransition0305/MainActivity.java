package com.thanhtam.drawabletransition0305;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinh;
    Button btnStart , btnReverse;
    TransitionDrawable transitionDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgHinh = (ImageView)findViewById(R.id.imageView);
        btnStart = (Button)findViewById(R.id.buttonStart);
        btnReverse = (Button)findViewById(R.id.buttonReverse);
        transitionDrawable = (TransitionDrawable) imgHinh.getDrawable();
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                               // Start Chuyển từ hình 1 sang 2 nhưng khoông ngược lại
                transitionDrawable.startTransition(3000);
            }
        });
        btnReverse.setOnClickListener(new View.OnClickListener() {      //Reverse Chuyển từ hình 1 sang 2 và ngược lại
            @Override
            public void onClick(View v) {
                transitionDrawable.reverseTransition(3000);
            }
        });
    }
}
