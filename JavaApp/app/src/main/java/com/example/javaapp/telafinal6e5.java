package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telafinal6e5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telafinal6e5);

        TextView nome = (TextView) findViewById(R.id.nome);
        TextView pont = (TextView) findViewById(R.id.pont);

        Intent it = getIntent();

        Bundle parametros = it.getExtras();

        pont1 = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");

        nome.setText("Congratulations");
        pont.setText(""+pont1);
    }

    public void refazer(View view) {
        Intent it2 = new Intent(telafinal6e5.this, MainActivity.class);
        startActivity(it2);
    }

    String nome1, senha1, email1;
    int pont1;

    public void pontuacao(View view) {
        Intent it = getIntent();
        Bundle parametros = it.getExtras();

        pont1 = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");

        Intent it2 = new Intent(telafinal6e5.this, pont.class);
        it2.putExtra("pont", pont1);
        it2.putExtra("nome", nome1);
        it2.putExtra("email", email1);
        it2.putExtra("senha", senha1);
        startActivity(it2);
    }
}