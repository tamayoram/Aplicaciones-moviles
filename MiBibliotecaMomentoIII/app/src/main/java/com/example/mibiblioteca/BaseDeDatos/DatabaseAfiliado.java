package com.example.mibiblioteca.BaseDeDatos;

//Vamos a invocar las librerías necesarias para Insert, Update, Delete y Select.
//
import java.util.ArrayList; //Permite crear una variable tipo vector para llevar de una vez
                                    //todos los campos de cada tabla.
import java.util.List; //Permite almacenar una consulta para luego visualizarla en pantalla.

import android.content.ContentValues; //Para enviar los datos a la Base de Datos.
import android.content.Context;
import android.database.Cursor;

import com.example.mibiblioteca.Tablas.Afiliado;

//El objetivo de esta clase es crear las 4 operaciones (CRUD) que se le pueden realizar a cualquier
//tabla de una Base de Datos.
//Insert, Delete, Update y Select
//
public class DatabaseAfiliado extends DatabaseAccess{
    //Vamos a crear un vector para guardar todos los campos de la tabal TAFILIADO
    private final static String[] allColumns = {Afiliado.COLUMNA_ID, Afiliado.COLUMNA_NOMBRE,
        Afiliado.COLUMNA_SEXO, Afiliado.COLUMNA_ESTADO, Afiliado.COLUMNA_CIUDAD,
            Afiliado.COLUMNA_DIRECCION, Afiliado.COLUMNA_TELEFONO};
    //Ahora vamos a abrir la Base de Datos para poder grabar y demás.
    public DatabaseAfiliado(Context context)
    {
        super(context);
    }

    public Afiliado ingresarAfiliado(String nombre, String sexo, boolean estado,
                                     String ciudad, String direccion, String telefono) {
        ContentValues values = new ContentValues();
        values.put(Afiliado.COLUMNA_NOMBRE, nombre);
        values.put(Afiliado.COLUMNA_SEXO, sexo);
        values.put(Afiliado.COLUMNA_ESTADO, estado);
        values.put(Afiliado.COLUMNA_CIUDAD, ciudad);
        values.put(Afiliado.COLUMNA_DIRECCION, direccion);
        values.put(Afiliado.COLUMNA_TELEFONO, telefono);

        long insertId = database.insert(Afiliado.NOMBRE_TABLA, null,
                values);
        Cursor cursor = database.query(Afiliado.NOMBRE_TABLA,
                allColumns, Afiliado.COLUMNA_ID + " = " + insertId,
                null,
                null, null, null);
        cursor.moveToFirst();
        Afiliado newAfiliado = cursorToAfiliado(cursor);
        cursor.close();
        return newAfiliado;
    }

    public void borrarAfiliado(String id) {
        //String id = string.getId();
        System.out.println("Afiliado borrado con id: " + id);
        database.delete(Afiliado.NOMBRE_TABLA,
                Afiliado.COLUMNA_ID + " = " + id,
                null);
    }

    public List<Afiliado> getAllAfiliados() {
        List<Afiliado> afiliados = new ArrayList<Afiliado>();
        Cursor cursor = database.query(Afiliado.NOMBRE_TABLA,
                allColumns, null, null, null,
                null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Afiliado afiliado = cursorToAfiliado(cursor);
            afiliados.add(afiliado);
            cursor.moveToNext();
        }
        cursor.close();
        return afiliados;
    }

    public Afiliado getAfiliado(String id ) {
        Afiliado afiliado = null;
        Cursor cursor = database.query(Afiliado.NOMBRE_TABLA,
                allColumns, Afiliado.COLUMNA_ID +" = "+id,
                null, null, null, null);
        cursor.moveToFirst();
        if (!cursor.isAfterLast()) {
            afiliado = cursorToAfiliado(cursor);
        }
        cursor.close();
        return afiliado;
    }


    private static Afiliado cursorToAfiliado(Cursor cursor) {
        Afiliado afiliado = new Afiliado();
        afiliado.setId(cursor.getString(0));
        afiliado.setNombre(cursor.getString(1));
        afiliado.setSexo(cursor.getString(2));
        afiliado.setEstado(Boolean.getBoolean(cursor.getString(3)));
        afiliado.setCiudad(cursor.getString(4));
        afiliado.setDireccion(cursor.getString(5));
        afiliado.setTelefono(cursor.getString(6));
        return afiliado;
    }

    public void actualizarAfiliado(String id, String nombre, String sexo, boolean estado,
                                   String ciudad, String direccion, String telefono)
    {
        ContentValues values = new ContentValues();
        values.put(Afiliado.COLUMNA_NOMBRE, nombre);
        values.put(Afiliado.COLUMNA_SEXO, sexo);
        values.put(Afiliado.COLUMNA_ESTADO, estado);
        values.put(Afiliado.COLUMNA_CIUDAD, ciudad);
        values.put(Afiliado.COLUMNA_DIRECCION, direccion);
        values.put(Afiliado.COLUMNA_TELEFONO, telefono);

        database.update(Afiliado.NOMBRE_TABLA, values,Afiliado.COLUMNA_ID + " = " + id,
                null);
    }

}
