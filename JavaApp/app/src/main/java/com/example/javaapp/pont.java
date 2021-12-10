package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class pont extends AppCompatActivity {

    ListView lista;
    UserDAO db = new UserDAO(this);
    User a = new User();
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    String nome, email, senha, pont2;
    int pontu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pont);

        Intent it = getIntent();
        Bundle parametros = it.getExtras();
        pontu = parametros.getInt("pont");
        nome = parametros.getString("nome");
        email = parametros.getString("email");
        senha = parametros.getString("senha");

        pont2 = String.valueOf(pontu);

        User a = new User();

        a.setNome(nome);
        a.setEmail(email);
        a.setSenha(senha);
        a.setNota2(pont2);

        Toast.makeText(pont.this, a.getNota2(), Toast.LENGTH_SHORT).show();

        db = new UserDAO(pont.this);
        db.cadastrar(nome, email, senha, pont2);

        lista = (ListView) findViewById(R.id.listview);
        listarAlunos();
    }

    public void listarAlunos() {
        List<User> alunos = db.listaTipos();
        arrayList= new ArrayList<String>();
        adapter= new ArrayAdapter<String>(pont.this,android.R.layout.simple_list_item_1, arrayList);
        lista.setAdapter(adapter);
        for (User a : alunos)
        {
            arrayList.add(a.getNome() + "   -   " + a.getNota2());
            adapter.notifyDataSetChanged();
        }
    }

    public void refazer(View view) {
        Intent it2 = new Intent(pont.this, MainActivity.class);
        startActivity(it2);
    }

}
