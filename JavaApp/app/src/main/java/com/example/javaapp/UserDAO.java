package com.example.javaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UserDAO extends SQLiteOpenHelper {

    private static String database = "jogo";
    public String nome;
    private static int versao = 6;

    public UserDAO(@Nullable Context context) {
        super(context, database, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql =
                "create table usuario(id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, email TEXT, senha TEXT, pont TEXT); ";
        db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int v1, int v2) {
        // TODO Auto-generated method stub
        String sql = "drop table if exists usuario";
        db.execSQL(sql);
        this.onCreate(db);
    }

    public void cadastrar(String nome, String email, String senha, String pont2) {
        ContentValues v = new ContentValues();
        v.put("nome", nome);
        v.put("email", email);
        v.put("senha", senha);
        v.put("pont", pont2);
        getWritableDatabase().insert("usuario", null, v);
    }

    public List<User> listaTipos() {
        List<User> alunos = new ArrayList<User>();
        String query = "SELECT * FROM usuario order by pont desc";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(query, null);
        if (c.moveToFirst()) {
            do {
                User a = new User();
                a.setId(Integer.parseInt(c.getString(0)));
                a.setNome(c.getString(1));
                a.setEmail(c.getString(2));
                a.setSenha(c.getString(3));
                a.setNota2(c.getString(4));
                alunos.add(a);
            }
            while (c.moveToNext());
        }
        return alunos;
    }

}
