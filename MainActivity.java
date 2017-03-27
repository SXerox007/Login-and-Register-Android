package com.example.sumit_thakur.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ContactEmail, ContactPassword;
    Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContactEmail = (EditText) findViewById(R.id.edit_text);
        ContactPassword = (EditText) findViewById(R.id.text_password_create);
        login = (Button)findViewById(R.id.btn_login);
        register=(Button)findViewById(R.id.btn_register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginPressed();
                //Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //startActivity(intent);
            }
        });

        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onRegisterPressed();
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });


    }


    public void onLoginPressed() {
        String Email = ContactEmail.getText().toString();
        String Password = ContactPassword.getText().toString();

        if (Email.isEmpty() || Password.isEmpty()) {
            Toast.makeText(getBaseContext(), "All fields are required.", Toast.LENGTH_LONG).show();
            return;
        } else {
            if (Email.equals("sumit") && Password.equals("sumit")) {
                Toast.makeText(getBaseContext(), "Login Sucessfully.", Toast.LENGTH_LONG).show();
                ContactEmail.setText("");
                ContactPassword.setText("");
            }
            else{
                Toast.makeText(getBaseContext(), "Error", Toast.LENGTH_LONG).show();
            }
        }

    }




}