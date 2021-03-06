package com.example.trafficlight;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        TextView tv1 = (TextView) findViewById(R.id.textView3);
        TextView tv2 = (TextView) findViewById(R.id.textView4);

        Intent intent_1 = getIntent();

        String id = intent_1.getStringExtra("inputed_id");
        String password = intent_1.getStringExtra("inputed_password");

        tv1.setText(String.valueOf(id));
        tv2.setText(String.valueOf(password));
    }

    public void onClick_back(View v){
        //finish();
    }

}
