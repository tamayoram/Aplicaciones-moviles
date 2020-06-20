package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList; // librería para manejar vectores
import java.util.List; // recuperar datos de la BD

import android.content.ContentValues; //librería para enviar datos a la BD
import android.content.Context; //librería para manejar la base de datos
import android.database.Cursor;

import com.example.mibibliotecabasedatos.tablas.Libro;

public class DataBaseLibro extends DataBaseAccess
{
    private static String[] allcolumns={Libro.COLUMNA_ID,Libro.COLUMNA_FEPUBLICACION,Libro.COLUMNA_AUTOR,Libro.COLUMNA_ESTADO,
            Libro.COLUMNA_TITULO}; // vector con la información de campos para libro

    public DataBaseLibro(Context context)
    {
        super(context); // abrir la base de datos de libro

    }
    //grabar (create)
    public Libro IngresarLibro(String fepublicacion, String autor, boolean estado,String titulo)
    {
        ContentValues values=new ContentValues();
        values.put(Libro.COLUMNA_FEPUBLICACION,fepublicacion); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Libro.COLUMNA_AUTOR,autor);
        values.put(Libro.COLUMNA_ESTADO,estado);
        values.put(Libro.COLUMNA_TITULO,titulo);

        long insertId= database.insert(Libro.NOMBRE_TABLA,null,values); // instrucción para grabar los values de arriba.

        return null; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public void borrarLibro(String id)
    {
        database.delete(Libro.NOMBRE_TABLA,Libro.COLUMNA_ID+"="+id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.
    }

    // actualizar (update)
    public void actualizarLibro(String id,String fepublicacion, String autor, boolean estado,String titulo)
    {
        ContentValues values=new ContentValues();
        values.put(Libro.COLUMNA_FEPUBLICACION,fepublicacion); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Libro.COLUMNA_AUTOR,autor);
        values.put(Libro.COLUMNA_ESTADO,estado);
        values.put(Libro.COLUMNA_TITULO,titulo);

        database.update(Libro.NOMBRE_TABLA,values,Libro.COLUMNA_ID+"="+id,null);
    }

    //consultar o leer (read)

    public Libro getLibro(String id)
    {
        Libro libro= null; //inicialización del objeto libro
        Cursor cursor= database.query(Libro.NOMBRE_TABLA, allcolumns,Libro.COLUMNA_ID+"="+id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.close(); // se cierra la consulta
        return libro; //se devuelve la tabla

    }

}
