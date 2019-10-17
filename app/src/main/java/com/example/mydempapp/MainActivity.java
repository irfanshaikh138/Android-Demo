package com.example.mydempapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        // Executed when app orientation changes
        super.onConfigurationChanged(newConfig);
        Log.d("demo","orientation changed!!"+newConfig.orientation);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Log.d("demo","welcome to portrait mode");
        }
        else if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.d("demo","welcome to landscape mode");
        }
    }
}
