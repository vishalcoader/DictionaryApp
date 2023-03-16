package com.seeksolution.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText et_userid , et_password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        et_userid = (EditText) findViewById(R.id.et_userid);
        et_password = (EditText) findViewById(R.id.et_password);

    }
    public void login(View v){

        String username = et_userid.getText().toString();
        String password = et_password.getText().toString();

        if(username.trim().isEmpty()){
            et_userid.setError("Empty");
            et_userid.requestFocus();
        }else if(password.trim().isEmpty()){
            et_password.setError("Empty");
            et_password.requestFocus();
        }

        if(username.equals("admin@gmail.com") && password.equals("admin@123")){

            Toast.makeText(this, "valid user", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(LoginActivity.this , AddWordActivity.class);
            startActivity(i);
            finish();

        }else{

            Toast.makeText(this, "Invalid User", Toast.LENGTH_SHORT).show();
            et_userid.setText("");
            et_password.setText("");
            et_userid.requestFocus();

        }

    }
}