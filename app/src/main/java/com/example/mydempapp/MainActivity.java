package com.example.mydempapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
    }
    public void doSomething(View v){
        Intent intent=null ,chooser=null;
        if (v.getId()==R.id.button){
            Toast toast=Toast.makeText(this,"This is First Toast message of my app",Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER,-100,-200);

        }


    }
}
