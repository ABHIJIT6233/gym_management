package com.example.fitnessclud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registration extends AppCompatActivity {
    EditText remail, rpassword;
    Button rregistration;
    
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        remail = (EditText) findViewById(R.id.remail);
        rpassword = (EditText) findViewById(R.id.rpassword);

        rregistration = (Button) findViewById(R.id.rregistration);
        
        firebaseAuth = FirebaseAuth.getInstance();

        rregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = remail.getText().toString();
                
                String password = rpassword.getText().toString();
                
                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(registration.this, "Enter email and password", Toast.LENGTH_SHORT).show();
                }
                else{
                    reg(email, password);
                }
            }
        });

    }

    private void reg(String email, String password) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(registration.this, "Registration successful", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), login.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(registration.this, "Registration failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}