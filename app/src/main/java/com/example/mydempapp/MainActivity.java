package com.example.mydempapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            // First way
//        Intent i=new Intent(this, Main2Activity.class);
            // Second way
            intent=new Intent();
            intent.setClassName("com.example.mydempapp","com.example.mydempapp.Main2Activity");
            startActivity(intent);
        }
        if (v.getId()==R.id.launchMap){
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.8777"));
           chooser = Intent.createChooser(intent,"Launch Maps");

            startActivity(chooser);
        }

        if (v.getId()==R.id.sendImage){
            Uri imageUri=Uri.parse("android.resource://slidenerd.vivz/drawable"+R.drawable.ic_launcher_foreground);
            intent=new Intent(Intent.ACTION_SEND);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,imageUri);
            intent.putExtra(Intent.EXTRA_TEXT,"Hey, I have attached the image");
            chooser = Intent.createChooser(intent,"Send Image");

            startActivity(chooser);
        }

        if (v.getId()==R.id.sendEmail){
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"irfanshkh52@gmail.com","iamirfan321@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"HI!!, This was sent from my app");
            intent.putExtra(Intent.EXTRA_TEXT,"Hi, How are u , This is my first Email From My app");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }

    }
}
