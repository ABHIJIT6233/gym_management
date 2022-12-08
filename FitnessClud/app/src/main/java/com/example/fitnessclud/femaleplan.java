package com.example.fitnessclud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class femaleplan extends AppCompatActivity {
    Button back, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_femaleplan);
        
        back = (Button) findViewById(R.id.back);
        next = (Button) findViewById(R.id.next);
        
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), maleplan.class);
                startActivity(intent);
                Toast.makeText(femaleplan.this, "You are on MALE PLAN page", Toast.LENGTH_SHORT).show();
            }
        });
        
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), admissionpage.class);
                startActivity(intent);
                Toast.makeText(femaleplan.this, "You are on ADMISSION PAGE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}