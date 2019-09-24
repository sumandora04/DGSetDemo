package com.notepoint.dgsetdemo.splashEntry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.notepoint.dgsetdemo.R;
import com.notepoint.dgsetdemo.logIn.LoginActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView layout = findViewById(R.id.imageView);
        TextView textSplash = findViewById(R.id.text_splash);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        layout.startAnimation(animation);
        textSplash.startAnimation(animation);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                    Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    SplashScreenActivity.this.finish();
                }
            }
        };
        timer.start();
    }
}
