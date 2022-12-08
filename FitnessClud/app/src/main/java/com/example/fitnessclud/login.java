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

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText lemail, lpassword;
    Button llogin;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lemail = (EditText) findViewById(R.id.lemail);
        lpassword = (EditText) findViewById(R.id.lpassword);
        llogin = (Button) findViewById(R.id.llogin);

        firebaseAuth = FirebaseAuth.getInstance();

        llogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = lemail.getText().toString();

                String password = lpassword.getText().toString();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(login.this, "Enter email and password", Toast.LENGTH_SHORT).show();
                }
                else{
                    lgn(email, password);
                }
            }
        });
    }

    private void lgn(String email, String password) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {

                Intent intent = new Intent(getApplicationContext(), homepagemain.class);
                startActivity(intent);

                Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(this, new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}