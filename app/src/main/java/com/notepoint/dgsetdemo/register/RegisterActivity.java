package com.notepoint.dgsetdemo.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.notepoint.dgsetdemo.R;
import com.notepoint.dgsetdemo.home.HomePageActivity;
import com.notepoint.dgsetdemo.logIn.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        findViewById(R.id.login_text_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });
    }

    public void onregisterSubmit(View view) {
        startActivity(new Intent(RegisterActivity.this, HomePageActivity.class));
        finish();
    }
}
