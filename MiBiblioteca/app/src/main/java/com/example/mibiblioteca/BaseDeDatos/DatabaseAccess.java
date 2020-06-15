package com.example.mibiblioteca.BaseDeDatos;

//Invocar las librerías principales para administrar una Base de Datos
//de SQLITE

//Permite capturar los errores de SQL, como por ejemplo, que la Base de Datos
//esta desconectada.
import java.sql.SQLException;

//Permite crear la plantilla de la Base de Datos, para luego crearle los demás
//objetos como tablas, procedimientos almacenados, funciones, etc.
import android.content.Context;

//Permite asignar los párametros necesarios para que la Base de Datos sea creada,
//como, el nombre, el usuario y la contraseña.
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccess {

    //Vamos a definir o crear 2 variables generales que nos van a servir
    //para administrar la Base de Datos en  el proyecto o APP

    protected SQLiteDatabase database;  //Permite abrir la Base de Datos.
    protected DatabaseHelper dbHelper;  //Interactuá con la anterior para crear las tablas.

    //A continuación vamos a asignar el nombre de la Base de Datos y sus tablas a una
    //variable.
    public DatabaseAccess(Context context)
    {
        dbHelper = new DatabaseHelper(context);
    }

    //Vamos a crear un método para abrir la base de datos.
    public void open() throws SQLException
    {
        //La siguiente instrucción lo que permite es verificar si la Base de Datos existe
        //para ABRIRLA y en caso contrario la CREA.
       database = dbHelper.getWritableDatabase();
    }

    //Vamos a crear el método para cerrar la Base de Datos
    public void close()
    {
        dbHelper.close();
    }
}
