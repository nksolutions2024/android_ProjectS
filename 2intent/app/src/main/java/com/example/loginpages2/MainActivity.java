package com.example.loginpages2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etuername);
        login=findViewById(R.id.loginbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("unamenext",uname);
                startActivity(i);

            }
        }); //end of loginbutton
    }
}