package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pergunta07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta07);

        Intent it18 = getIntent();
        String inf = it18.getStringExtra("msg");
    }

    String nome1, senha1, email1;
    int pont;

    public void errada(View view) {
        Intent it = getIntent();
        Bundle parametros = it.getExtras();

        pont = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");

        if (pont == 7){
            Intent it2 = new Intent(pergunta07.this, telafinal.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else if (pont == 5 || pont == 6){
            Intent it2 = new Intent(pergunta07.this, telafinal6e5.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else if (pont == 4 || pont == 3){
            Intent it2 = new Intent(pergunta07.this, telafinal4e3.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else{
            Intent it2 = new Intent(pergunta07.this, telafinalnotai.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }
    }

    public void certo(View view) {
        Intent it = getIntent();
        Bundle parametros = it.getExtras();

        pont = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");
        pont = (pont + 1);

        if (pont == 7){
            Intent it2 = new Intent(pergunta07.this, telafinal.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else if (pont == 5 || pont == 6){
            Intent it2 = new Intent(pergunta07.this, telafinal6e5.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else if (pont == 4 || pont == 3){
            Intent it2 = new Intent(pergunta07.this, telafinal4e3.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }

        else if (pont == 1 || pont == 0 || pont == 2){
            Intent it2 = new Intent(pergunta07.this, telafinalnotai.class);
            it2.putExtra("pont", pont);
            it2.putExtra("nome", nome1);
            it2.putExtra("email", email1);
            it2.putExtra("senha", senha1);
            startActivity(it2);
        }
    }
}