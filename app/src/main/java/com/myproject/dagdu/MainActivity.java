package com.myproject.dagdu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);

//                SharedPreferences pref = getSharedPreferences("dagaduteli_preferences", Context.MODE_PRIVATE);
//                user_id = pref.getString("user_id", "");
//                login_flag = pref.getString("login_flag", "");

//                if (login_flag.equals("true") && user_id.trim().length() > 0) {
//                    Intent intent = new Intent(MainActivity.this, Act_Home.class);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                    startActivity(intent);
//                    //  finish();
//                }else {
//                    Intent intent = new Intent(MainActivity.this, Act_Authentication.class);
//                    //  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                    startActivity(intent);
//                    // finish();
//                }

            }
        }, 1500);
    }
}