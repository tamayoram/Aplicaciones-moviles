package com.example.mibiblioteca.BaseDeDatos;
//Vamos a invocar las librerías necesarias para Insert, Update, Delete y Select.
//
import java.nio.LongBuffer;
import java.util.ArrayList; //Permite crear una variable tipo vector para llevar de una vez
//todos los campos de cada tabla.
import java.util.List; //Permite almacenar una consulta para luego visualizarla en pantalla.

import android.content.ContentValues; //Para enviar los datos a la Base de Datos.
import android.content.Context;
import android.database.Cursor;

import com.example.mibiblioteca.Tablas.Libro;

//El objetivo de esta clase es crear las 4 operaciones (CRUD) que se le pueden realizar a cualquier
//tabla de una Base de Datos.
//Insert, Delete, Update y Select
//
public class DatabaseLibro  extends DatabaseAccess{

    //Vamos a crear un vector para guardar todos los campos de la tabal TAFILIADO
    private final static String[] allColumns = {Libro.COLUMNA_ID, Libro.COLUMNA_AUTOR,
                Libro.COLUMNA_ESTADO, Libro.COLUMNA_FEPUBLICACION, Libro.COLUMNA_TITULO};
    //Ahora vamos a abrir la Base de Datos para poder grabar y demás.
    public DatabaseLibro(Context context)
    {
        super(context);
    }

    public Libro ingresarLibro(String autor, String estado, String fepublicacion,
                                     String titulo)
    {
        ContentValues values = new ContentValues();
        values.put(Libro.COLUMNA_AUTOR, autor);
        values.put(Libro.COLUMNA_ESTADO, estado);
        values.put(Libro.COLUMNA_FEPUBLICACION, fepublicacion);
        values.put(Libro.COLUMNA_TITULO, titulo);
        long insertId = database.insert(Libro.NOMBRE_TABLA, null, values);

        return null;
    }

    public void borrarLibro(String id)
    {
        database.delete(Libro.NOMBRE_TABLA, Libro.COLUMNA_ID + " = " + id,
                null);
    }

    public void actualizarLibro(String id, String autor, String estado, String fepublicacion,
                                String titulo)
    {
        ContentValues values = new ContentValues();
        values.put(Libro.COLUMNA_AUTOR, autor);
        values.put(Libro.COLUMNA_ESTADO, estado);
        values.put(Libro.COLUMNA_FEPUBLICACION, fepublicacion);
        values.put(Libro.COLUMNA_TITULO, titulo);

        database.update(Libro.NOMBRE_TABLA, values,Libro.COLUMNA_ID + " = " + id,
                null);
    }

    public Libro getAfiliado(String id)
    {
        //1. Vamos a crear una tabla para recibir los datos que me devuelva la consulta.
        Libro libro  = null;
        //2. Ahora vamos a definir una variable para que nos reciba los datos que arroja la
        //consulta.
        Cursor cursor = database.query(Libro.NOMBRE_TABLA, allColumns,
                Libro.COLUMNA_ID + " = " + id, null, null,
                null, null);
        cursor.close();
        return libro;
    }

}
