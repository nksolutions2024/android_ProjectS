package com.example.loginpages2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        showMessage=findViewById(R.id.textView2);
        showMessage.setText("welcome " + getIntent().getStringExtra("unamenext"));
    }
}