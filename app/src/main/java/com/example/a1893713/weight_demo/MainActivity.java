package com.example.a1893713.weight_demo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById( R.id.img);

       /* ObjectAnimator animator = ObjectAnimator.ofFloat(img,"rotationY",0,0f,360f);
        animator.setDuration(3000);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();
*/

       Animation ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
       ani.setDuration(3000);


       img.setAnimation(ani);

    }
}
