package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciar = (Button) findViewById(R.id.button);
        iniciar.setOnClickListener(new View.OnClickListener() {

            String nome1, senha1, email1;
            int pont = 0;

            @Override
            public void onClick(View v) {
                Intent it2 = getIntent();
                Bundle parametros = it2.getExtras();

                pont = parametros.getInt("pont");
                nome1 = parametros.getString("nome");
                email1 = parametros.getString("email");
                senha1 = parametros.getString("senha");

                Intent it = new Intent(MainActivity.this, pergunta01.class);
                it.putExtra("pont", pont);
                it.putExtra("nome", nome1);
                it.putExtra("email", email1);
                it.putExtra("senha", senha1);
                startActivity(it);
            }
        });
    }
}