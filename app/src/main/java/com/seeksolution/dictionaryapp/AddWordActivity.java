package com.seeksolution.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddWordActivity extends AppCompatActivity {

    private EditText et_word , et_meaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        getSupportActionBar().hide();

        et_word = (EditText) findViewById(R.id.et_word);
        et_meaning = (EditText) findViewById(R.id.et_meaning);

    }

    public void add(View v){

        String word = et_word.getText().toString();
        String meaning = et_meaning.getText().toString();

        if(word.trim().isEmpty()){
            et_word.setError("Empty");
            et_word.requestFocus();
        }else if(meaning.trim().isEmpty()){
            et_meaning.setError("Empty");
            et_meaning.requestFocus();
        }else{
            //code to insert word and meaning

        }
    }
}