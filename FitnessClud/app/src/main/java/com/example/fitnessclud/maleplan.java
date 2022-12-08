package com.example.fitnessclud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class maleplan extends AppCompatActivity {
    Button back , femaleplan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maleplan);

        back = (Button) findViewById(R.id.back);
        femaleplan = (Button) findViewById(R.id.femaleplan);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homepagemain.class);
                startActivity(intent);

                Toast.makeText(maleplan.this, "You are on HOME PAGE", Toast.LENGTH_SHORT).show();
            }
        });

        femaleplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), femaleplan.class);
                startActivity(intent);
                Toast.makeText(maleplan.this, "You are on FEMALE PLAN page", Toast.LENGTH_SHORT).show();
            }
        });

    }
}