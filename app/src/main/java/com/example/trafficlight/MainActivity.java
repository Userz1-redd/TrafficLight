package com.example.trafficlight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView idText = (TextView) findViewById(R.id.textView);
        //TextView passwordText = (TextView) findViewById(R.id.textView2);

        Button SignIn = (Button) findViewById(R.id.button);
        //Button SignUp = (Button) findViewById(R.id.button2);

        Intent intent = getIntent();

        //idText.setText("ID");
        //passwordText.setText("Password");

        //SignIn.setText("Sign In");
        //SignUp.setText("Sign Up");


        SignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //EditText edit_id = (EditText) findViewById(R.id.idText);
                //EditText edit_password = (EditText) findViewById(R.id.passwordText);

                //String id = edit_id.getText().toString();
                //String password = edit_password.getText().toString();

                Intent intent_1 = new Intent(getApplicationContext(), MapActivity.class);

                //intent_1.putExtra("inputed_id",id);
                //intent_1.putExtra("inputed_password",password);

                startActivity(intent_1);
            }
        });
    }



}