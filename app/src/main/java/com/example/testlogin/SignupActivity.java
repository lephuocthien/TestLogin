package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView alreadyHaveAccountText = (TextView) findViewById(R.id.alreadyHaveAccount);
        alreadyHaveAccountText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent activity_login=new Intent(SignupActivity.this, MainActivity.class);
                activity_login.addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
                //startActivity(activity_login);
                finish();
            }
        });
    }
}
