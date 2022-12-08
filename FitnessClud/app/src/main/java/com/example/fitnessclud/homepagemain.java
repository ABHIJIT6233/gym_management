package com.example.fitnessclud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class homepagemain extends AppCompatActivity {
    ImageButton male , female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagemain);

        male = (ImageButton) findViewById(R.id.male);
        female = (ImageButton) findViewById(R.id.female); 
        
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), maleplan.class);
                startActivity(intent);

                Toast.makeText(homepagemain.this, "You are on MALE PLAN page", Toast.LENGTH_SHORT).show();
            }
        });
        
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), femaleplan.class);
                startActivity(intent);

                Toast.makeText(homepagemain.this, "You are on FEMALE PLAN page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}