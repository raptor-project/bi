package com.raptor.raptorexpect;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import com.raptor.raptorexpect.Activity.LoginActivity;
import com.raptor.raptorexpect.Utillity.OnSwipeTouchListener;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    TextView txtsplashscreen;
    private ArrayList<Integer> imageList=new ArrayList<>();
    Animation animswipeup;
    ImageView imgsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView)findViewById(R.id.imageView);
        imgsplash = (ImageView)findViewById(R.id.imgsplash);
        txtsplashscreen = (TextView)findViewById(R.id.swipeupTextView);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Typeface font = Typeface.createFromAsset(getAssets(), "robotoblack.ttf");
        txtsplashscreen.setTypeface(font);
        imageList.add(R.drawable.ic_full_set_backgroundpurble);
        imageList.add(R.drawable.ic_full_set_backgroundyellow);
        Collections.shuffle(imageList);
        imageView.setImageResource(imageList.get(0));
        animswipeup = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim);
        imgsplash.setOnTouchListener(new OnSwipeTouchListener(SplashScreen.this) {
            public void onSwipeTop() {

                imgsplash.setAnimation(animswipeup);
             Intent intent = new Intent(SplashScreen.this,LoginActivity.class);
          startActivity(intent);
            }

        });
    }





}
