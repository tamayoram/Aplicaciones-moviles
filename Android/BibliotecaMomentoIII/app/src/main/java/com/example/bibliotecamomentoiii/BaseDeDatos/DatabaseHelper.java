package com.example.bibliotecamomentoiii.BaseDeDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.bibliotecamomentoiii.Tablas.Afiliado;
import com.example.bibliotecamomentoiii.Tablas.Libro;
import com.example.bibliotecamomentoiii.Tablas.Reserva;

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static String DATABASE_NAME = "bibliotecaMIERCOLES.db";
    private final static int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database)
    {
        database.execSQL(Afiliado.CREATE_TABLE);
        database.execSQL(Libro.CREATE_TABLE);
        database.execSQL(Reserva.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {

    }
}

