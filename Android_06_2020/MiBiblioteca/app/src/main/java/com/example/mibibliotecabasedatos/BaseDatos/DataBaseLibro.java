package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList; // librería para manejar vectores
import java.util.List; // recuperar datos de la BD

import android.content.ContentValues; //librería para enviar datos a la BD
import android.content.Context; //librería para manejar la base de datos
import android.database.Cursor;

import com.example.mibibliotecabasedatos.tablas.Libro;

public class DataBaseLibro extends DataBaseAccess
{
    private static String[] allcolumns={Libro.COLUMNA_ID, Libro.COLUMNA_TITULO,Libro.COLUMNA_AUTOR,Libro.COLUMNA_FEPUBLICACION,
            Libro.COLUMNA_ESTADO}; // vector con la información de campos para libro

    public DataBaseLibro(Context context)
    {
        super(context); // abrir la base de datos de libro

    }
    //grabar (create)
    public Libro IngresarLibro(String titulo,String autor,String fepublicacion,boolean estado)
    {
        ContentValues values=new ContentValues();
        values.put(Libro.COLUMNA_TITULO,titulo);
        values.put(Libro.COLUMNA_AUTOR,autor);
        values.put(Libro.COLUMNA_FEPUBLICACION,fepublicacion); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Libro.COLUMNA_ESTADO,estado);


        long insertId= database.insert(Libro.NOMBRE_TABLA,null,values); // instrucción para grabar los values de arriba.

        Cursor cursor = database.query(Libro.NOMBRE_TABLA,
                allcolumns, Libro.COLUMNA_ID + " = " + insertId,
                null,
                null, null, null);
        cursor.moveToFirst();
        Libro newLibro = cursorToLibro(cursor);
        cursor.close();
        return newLibro; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public Libro borrarLibro(String id)
    {
        database.delete(Libro.NOMBRE_TABLA,Libro.COLUMNA_ID+ " = "+ id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.
        return null;
    }

    // actualizar (update)
    public Libro actualizarLibro(String id, String titulo, String autor, String fepublicacion, boolean estado)
    {
        ContentValues values=new ContentValues();
        values.put(Libro.COLUMNA_TITULO,titulo);
        values.put(Libro.COLUMNA_AUTOR,autor);
        values.put(Libro.COLUMNA_FEPUBLICACION,fepublicacion); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Libro.COLUMNA_ESTADO,estado);


        database.update(Libro.NOMBRE_TABLA,values,Libro.COLUMNA_ID +" = "+ id,null);

        return  null;
    }

    //consultar o leer (read)

    public Libro getLibro(String id)
    {
        Libro libro= null; //inicialización del objeto libro
        Cursor cursor= database.query(Libro.NOMBRE_TABLA, allcolumns,Libro.COLUMNA_ID + " = " + id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.moveToFirst();
        if (!cursor.isAfterLast()) {
            libro = cursorToLibro(cursor);
        }

        cursor.close(); // se cierra la consulta
        return libro; //se devuelve la tabla

    }

    // código de la librería cursor
    public List<Libro> getAllLibros() {
        List<Libro> libros = new ArrayList<Libro>();
        Cursor cursor = database.query(Libro.NOMBRE_TABLA,
                allcolumns, null, null, null,
                null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Libro libro = cursorToLibro(cursor);
            libros.add(libro);
            cursor.moveToNext();
        }
        cursor.close();
        return libros;
    }

    private static Libro cursorToLibro(Cursor cursor) {
        Libro libro = new Libro();
        libro.setId(cursor.getString(0));
        libro.setTitulo(cursor.getString(1));
        libro.setAutor(cursor.getString(2));
        libro.setFepublicacion(cursor.getString(3));
        libro.setEstado(Boolean.getBoolean(cursor.getString(4)));

        return libro;
    }

}
