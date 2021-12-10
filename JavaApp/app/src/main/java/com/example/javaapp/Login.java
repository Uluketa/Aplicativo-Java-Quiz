package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.loopj.android.http.AsyncHttpClient;

public class Login extends AppCompatActivity {

    EditText nome, senha;
    AsyncHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button Btn = (Button) findViewById(R.id.button3);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this, MainActivity.class);
                startActivity(it);
            }
        });
    }

    public void cadastro(View view) {
        Intent it = new Intent(Login.this, Cadastro.class);
        startActivity(it);
    }

    public void entrar(View view) {
        Intent it = new Intent(Login.this, MainActivity.class);
        startActivity(it);
    }
}