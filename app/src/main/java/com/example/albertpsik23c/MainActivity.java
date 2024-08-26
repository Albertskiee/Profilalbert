package com.example.albertpsik23c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bprofil, bakad, bhobi,bcontact;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        bprofil = findViewById(R.id.btnprofil);
        bakad= findViewById(R.id.btnakad);
        bhobi = findViewById(R.id.btnhobi);
        bcontact= findViewById(R.id.btncontact);



        bprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profil.class);
                startActivity(intent);
            }
        });

        bakad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Akademik.class);
                startActivity(intent);
            }
        });

        bhobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hobi.class);
                startActivity(intent);
            }
        });
        bcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Contact.class);
                startActivity(intent);
                finish();
            }
        });




    }
}