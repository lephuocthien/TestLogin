package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView forgetPasswordText = (TextView) findViewById(R.id.forgetPassword);
        forgetPasswordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_signup=new Intent(MainActivity.this, SignupActivity.class);
                startActivity(activity_signup);
                //finish();
            }
        });

        TextView dontHaveAccountText = (TextView) findViewById(R.id.dontHaveAccount);
        dontHaveAccountText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_signup=new Intent(MainActivity.this, SignupActivity.class);
                startActivity(activity_signup);
                //finish();
            }
        });
    }
}
