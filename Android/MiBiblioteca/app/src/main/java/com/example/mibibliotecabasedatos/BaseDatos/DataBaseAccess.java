package com.example.mibibliotecabasedatos.BaseDatos;

// librerías principales para invocar una base de datos

import java.sql.SQLException; // Permite capturar los errores de SQL

import android.content.Context; //Permite crear la plantilla de la base de datos para luego crear los demás objetos como tablas, funciones, procedimientos almacenados,

import android.database.sqlite.SQLiteDatabase; // Permite asignar los parámetros necesarios para que la base de datos sea creada como el nombre, usuario, contraseña,

public class DataBaseAccess {

    protected SQLiteDatabase database; // permite abrir la base de datos
    protected DataBaseHelper dbHelper; // interactua con la anterior para crear las tablas.
}
