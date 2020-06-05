package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class activity_loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Thread bamgio=new Thread(){
            public void run()
            {
                try {
                    sleep(3500);
                } catch (Exception e) {

                }
                finally
                {
                    Intent activitymoi=new Intent(activity_loading.this, MainActivity.class);
                    startActivity(activitymoi);
                    finish();
                }
            }
        };
        bamgio.start();
    }
}
