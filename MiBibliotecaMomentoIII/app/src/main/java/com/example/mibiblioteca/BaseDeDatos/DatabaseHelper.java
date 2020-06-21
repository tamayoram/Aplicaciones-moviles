package com.example.mibiblioteca.BaseDeDatos;

//Vamos a invocar las librerías para crear la Base de Datos y
//sus respectivas tablas.
//

import android.content.Context; //Permite crear la DB y sus tablas.
import android.database.sqlite.SQLiteDatabase; //Ejecuta la estructura
                    //de cada tabla
import android.database.sqlite.SQLiteOpenHelper; //Permite reconocer
                    //los parámetros para crear la DB.
//Ahora referenciemos las clases que contienen el código para
//crear las tablas a la Base de Datos.
//
import com.example.mibiblioteca.Tablas.Afiliado;
import com.example.mibiblioteca.Tablas.Libro;
import com.example.mibiblioteca.Tablas.Reserva;
//
//La siguiente clase va a contener el código que va a permitir
//crear la Base de Datos y las tablas.
//
public class DatabaseHelper extends SQLiteOpenHelper {
    //Vamos a crear las variables generales que me van a permitir
    //crear la DB.
    private final static String DATABASE_NAME = "bibliotecaMIERCOLES.db";
    private final static int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context)
    {
        //La palabra super ejecuta la creación de la Base de Datos
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
