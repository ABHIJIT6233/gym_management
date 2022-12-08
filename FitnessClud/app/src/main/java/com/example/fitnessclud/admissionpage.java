package com.example.fitnessclud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class admissionpage extends AppCompatActivity {
    Button submit, home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissionpage);
        
        submit = (Button) findViewById(R.id.submit);
        home = (Button) findViewById(R.id.home);
        
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(admissionpage.this, "REGISTRATION SUCCESSFUL", Toast.LENGTH_SHORT).show();
            }
        });
        
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homepagemain.class);
                startActivity(intent);

                Toast.makeText(admissionpage.this, "You are on HOME page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}