package com.example.mydempapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(this);
       button.setOnClickListener(this);
    }

    // here the View tells which button is clicked
 public void doSomething(View v){
        if(v.getId()==R.id.button){
        Log.d("demo","Button1 was Clicked");
    } else if(v.getId()==R.id.button2){
            Log.d("demo","Button2 was Clicked");
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            Log.d("demo","Button One was clicked : reply by OnClickListener");
        } else if(v.getId()==R.id.button2){
            Log.d("demo","Button Two was Clicked : reply by OnClickListener");
        }

    }
}
