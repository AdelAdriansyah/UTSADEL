package com.example.uts191103556adeladriansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btFormLogin, btRegister, btprofil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btFormLogin = findViewById(R.id.btFormLogin);
        btRegister = findViewById(R.id.btRegister);
        btprofil = findViewById(R.id.btprofil);

        btFormLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, activity_login.class)
                        startActivity(i);
            }
        });

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, activity_register.class)
                        startActivity(i);
            }
        });
        btprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, activity_profil.class)
                startActivity(i);
            }
        });

    }
}