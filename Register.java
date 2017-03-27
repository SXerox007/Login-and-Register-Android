package com.example.sumit_thakur.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {

    EditText Email, password, rePassword;
    Button register;
    TextView alreadyAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);
        Email = (EditText) findViewById(R.id.text_id);
        password = (EditText) findViewById(R.id.text_password);
        rePassword = (EditText) findViewById(R.id.text_re_password);
        register = (Button) findViewById(R.id.btn_register);
        alreadyAccount = (TextView) findViewById(R.id.txt_already_Account);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegisterPressed();
                //Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //startActivity(intent);
            }
        });

    }


    public void onRegisterPressed() {
        String userEamil=Email.getText().toString();
        String userPassword=password.getText().toString();




    }
}