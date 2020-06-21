package com.example.bibliotecamomentoiii.BaseDeDatos;

import java.sql.SQLException;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccess {


    protected SQLiteDatabase database;
    protected DatabaseHelper dbHelper;


    public DatabaseAccess(Context context)
    {
        dbHelper = new DatabaseHelper(context);
    }


    public void open() throws SQLException
    {

        database = dbHelper.getWritableDatabase();
    }

    public void close()
    {
        dbHelper.close();
    }
}

