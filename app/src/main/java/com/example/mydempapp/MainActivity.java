package com.example.mydempapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("demo","onCreate was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("demo","onResume was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("demo","onStart was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("demo","onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("demo","onStop was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("demo","onRestart was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("demo","onDestroy was called");
    }
}
