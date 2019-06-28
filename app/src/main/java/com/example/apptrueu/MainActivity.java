package com.example.apptrueu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    private ViewFlipper myViewFlipper;
    private float initialXPoint;
    int[] image = { R.drawable.pic1 , R.drawable.pic2 ,R.drawable.pic3};
    TextView see_more1 , see_more2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        see_more1 = (TextView) findViewById(R.id.see_more1);
        see_more2 = (TextView) findViewById(R.id.see_more2);

        for (int i = 0; i < image.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(image[i]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            myViewFlipper.addView(imageView);
        }

        myViewFlipper.setAutoStart(true);
        myViewFlipper.setFlipInterval(2000);
        myViewFlipper.startFlipping();

        see_more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.txt1, Toast.LENGTH_SHORT).show();
            }
        });

        see_more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,  R.string.txt2, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
