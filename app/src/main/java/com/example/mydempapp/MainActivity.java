package com.example.mydempapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
    }
    public void doSomething(View v){
        // First way
//        Intent i=new Intent(this, Main2Activity.class);
        // Second way
        Intent i=new Intent();
        i.setClassName("com.example.mydempapp","com.example.mydempapp.Main2Activity");
        startActivity(i);
    }
}
