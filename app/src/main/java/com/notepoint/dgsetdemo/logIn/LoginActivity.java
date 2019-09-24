package com.notepoint.dgsetdemo.logIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.notepoint.dgsetdemo.R;
import com.notepoint.dgsetdemo.home.HomePageActivity;
import com.notepoint.dgsetdemo.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.register_text_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, HomePageActivity.class));
        finish();
    }
}
