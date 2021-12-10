package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pergunta06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta06);

        Intent it18 = getIntent();
        String inf = it18.getStringExtra("msg");
    }

    String nome1, senha1, email1;
    int pont;

    public void errada(View view) {
        Intent it2 = getIntent();
        Bundle parametros = it2.getExtras();

        pont = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");

        Intent it = new Intent(pergunta06.this, pergunta07.class);
        it.putExtra("pont", pont);
        it.putExtra("nome", nome1);
        it.putExtra("email", email1);
        it.putExtra("senha", senha1);
        startActivity(it);
    }

    public void certo(View view) {
        Intent it2 = getIntent();
        Bundle parametros = it2.getExtras();

        pont = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");
        pont = (pont + 1);

        Intent it = new Intent(pergunta06.this, pergunta07.class);
        it.putExtra("pont", pont);
        it.putExtra("nome", nome1);
        it.putExtra("email", email1);
        it.putExtra("senha", senha1);
        startActivity(it);
    }
}