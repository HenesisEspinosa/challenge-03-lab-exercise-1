package com.example.pc002.challege_03_lab_exercise_1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    public void sendMessage(View View){
        EditText editText = findViewById(R.id.enter_message);
        editText.setText("");
    }
}
