package com.example.mydempapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

RelativeLayout main;
EditText userNameValue,passwordValue;
TextView message,userName,password;
Button login;
LayoutParams messageDimensions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        //Here this is a refernce to the MainActivity"this class name"
        //MainActivity Etends AppCompatActivity and AppCompatActivity extends context
        //All this constructors requires context object inside
        init();
        createMessagetextView();
        main.addView(message,messageDimensions);
        setContentView(main);
    }
    private void init(){
        main=new RelativeLayout(this);
        LayoutParams mainDimensions=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);
        userNameValue=new EditText(this);
        passwordValue=new EditText(this);
        message=new TextView(this);
        userName=new TextView(this);
        password=new TextView(this);
        login=new Button(this);
    }

    private void createMessagetextView(){
        messageDimensions=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        messageDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        message.setText("Please Login First");
        message.setLayoutParams(messageDimensions);
    }
}
