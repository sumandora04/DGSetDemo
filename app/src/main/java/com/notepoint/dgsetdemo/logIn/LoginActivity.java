package com.notepoint.dgsetdemo.logIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.notepoint.dgsetdemo.R;
import com.notepoint.dgsetdemo.home.HomePageActivity;
import com.notepoint.dgsetdemo.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, HomePageActivity.class));
    }
}
