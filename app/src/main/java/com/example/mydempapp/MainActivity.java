package com.example.mydempapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
         Toast toast=new Toast(this);
         toast.setDuration(Toast.LENGTH_LONG);
         toast.setGravity(Gravity.BOTTOM,0,0);
         // Now Take xml appearance description and convert it into java view object.
            LayoutInflater inflater=getLayoutInflater();
            //
            View appearance=inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.root));
            toast.setView(appearance);
            toast.show();

        }


    }
}
