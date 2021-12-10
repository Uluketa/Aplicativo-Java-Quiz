package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class telafinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telafinal);

        TextView nome = (TextView) findViewById(R.id.nome);

        Intent it = getIntent();

        if (it != null)
        {
            Bundle parametros = it.getExtras();

            pont = parametros.getInt("pont");
            nome1 = parametros.getString("nome");
            email1 = parametros.getString("email");
            senha1 = parametros.getString("senha");
            nome.setText("Congratulations");
        }

        else
        {
            Bundle parametros = it.getExtras();

            pont = parametros.getInt("pont");
            nome1 = parametros.getString("nome");
            email1 = parametros.getString("email");
            senha1 = parametros.getString("senha");
        }
    }

    public void refazer(View view) {
        Intent it2 = new Intent(telafinal.this, MainActivity.class);
        startActivity(it2);
    }

    String nome1, senha1, email1;
    int pont;

    public void pontuacao(View view) {
        Intent it = getIntent();
        Bundle parametros = it.getExtras();

        pont = parametros.getInt("pont");
        nome1 = parametros.getString("nome");
        email1 = parametros.getString("email");
        senha1 = parametros.getString("senha");

        Intent it2 = new Intent(telafinal.this, pont.class);
        it2.putExtra("pont", pont);
        it2.putExtra("nome", nome1);
        it2.putExtra("email", email1);
        it2.putExtra("senha", senha1);
        startActivity(it2);
    }
}