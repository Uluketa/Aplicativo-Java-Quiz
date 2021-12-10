package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class Cadastro extends AppCompatActivity {

    EditText nome, senha, email;
    String nome1, senha1, email1;
    UserDAO db = new UserDAO(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.editTextTextPersonName);
        senha = (EditText) findViewById(R.id.editTextTextPassword);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        Button btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome1 = nome.getText().toString();
                senha1 = senha.getText().toString();
                email1 = email.getText().toString();

                Bundle parametros = new Bundle();
                parametros.putString("nome", nome1);
                parametros.putString("email", email1);
                parametros.putString("senha", senha1);

                Intent it = new Intent(Cadastro.this, MainActivity.class);
                it.putExtras(parametros);
                startActivity(it);
            }
        });
    }

    public void entro(View view) {
        Intent it = new Intent(Cadastro.this, MainActivity.class);
        startActivity(it);
    }
}