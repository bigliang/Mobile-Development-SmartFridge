package com.example.cse5236.smartfridge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainMenu extends AppCompatActivity {
    String TAG="MainMenu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart is Called\n\n");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume is Called\n\n");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause is Called\n\n");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop is Called\n\n");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy is Called\n\n");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart is Called\n\n");
    }





}
