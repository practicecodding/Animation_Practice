package com.hamidul.animationpractice;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageView clock,imageView;

    Button button;

    Animation animation,animation1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
         animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom_anim);
         animation1= AnimationUtils.loadAnimation(MainActivity.this,R.anim.up_from_bottom_slow);

         button.setOnClickListener(new View.OnClickListener() {
           @Override
         public void onClick(View view) {
           clock.startAnimation(animation);
        }
         });
        //====================================================================================================






    }
}