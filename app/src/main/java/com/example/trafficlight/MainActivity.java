package com.example.trafficlight;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//sssssfafasfa
    @Override
    //asdasdsad
    //2222
    protected void onCreate(Bundle savedInstanceState) {
        //TextView tv = new TextView();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView idText = (TextView) findViewById(R.id.idText);
        TextView passwordText = (TextView) findViewById(R.id.passwordText);

        Intent intent = getIntent();


    }
}