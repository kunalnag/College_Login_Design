package com.example.collegeproject1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.Toast;
import android.widget.Toast;


public class Signup_form extends AppCompatActivity {



    EditText txtEmail,txtPassword,txtConfirmPassword;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().setTitle("Signup Form");


        txtEmail = (EditText)findViewById(R.id.txt_mail);
        txtPassword = (EditText)findViewById(R.id.txt_password);
        txtConfirmPassword = (EditText)findViewById(R.id.txt_confirm_password);
        btn_register = (Button)findViewById(R.id.btnclick);



        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                String confirPassword = txtConfirmPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Signup_form.this,"Please Enter Email",Toast.LENGTH_SHORT);
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Signup_form.this,"Please Enter Password",Toast.LENGTH_SHORT);
                    return;

                }

                if(TextUtils.isEmpty(confirPassword)){
                    Toast.makeText(Signup_form.this,"Please Re-Enter Password",Toast.LENGTH_SHORT);
                    return;

                }

                if(password.length()<6){
                    Toast.makeText(Signup_form.this,"Password Length must be atleast 6 ",Toast.LENGTH_SHORT);
                    return;
                }

                if(password.equals(confirPassword)) {
                }

            }
        });
    }

}
