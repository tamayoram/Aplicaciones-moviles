package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList; // librería para manejar vectores
import java.util.List; // recuperar datos de la BD

import android.content.ContentValues; //librería para enviar datos a la BD
import android.content.Context; //librería para manejar la base de datos
import android.database.Cursor;
import android.service.restrictions.RestrictionsReceiver;

import com.example.mibibliotecabasedatos.tablas.Reserva;

public class DataBaseReserva extends DataBaseAccess {
    private static String[] allcolumns={Reserva.COLUMNA_ID,Reserva.COLUMNA_LIBRO,Reserva.COLUMNA_AFILIADO,Reserva.COLUMNA_FEENTREGA}; // vector con la información de campos para libro

    public DataBaseReserva(Context context)
    {
        super(context); // abrir la base de datos de libro

    }
    //grabar (create)
    public Reserva IngresarReserva(String libro, String afiliado, String feentrega)
    {
        ContentValues values=new ContentValues();
        values.put(Reserva.COLUMNA_LIBRO,libro); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Reserva.COLUMNA_AFILIADO,afiliado);
        values.put(Reserva.COLUMNA_FEENTREGA,feentrega);

        long insertId= database.insert(Reserva.NOMBRE_TABLA,null,values); // instrucción para grabar los values de arriba.

        return null; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public void borrarReserva(String id)
    {
        database.delete(Reserva.NOMBRE_TABLA,Reserva.COLUMNA_ID+"="+id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.
    }

    // actualizar (update)
    public void actualizarReserva(String id,String libro, String afiliado, String feentrega)
    {
        ContentValues values=new ContentValues();
        values.put(Reserva.COLUMNA_LIBRO,libro); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Reserva.COLUMNA_AFILIADO,afiliado);
        values.put(Reserva.COLUMNA_FEENTREGA,feentrega);

        database.update(Reserva.NOMBRE_TABLA,values,Reserva.COLUMNA_ID+"="+id,null);
    }

    //consultar o leer (read)

    public Reserva getLibro(String id)
    {
        Reserva libro= null; //inicialización del objeto libro
        Cursor cursor= database.query(Reserva.NOMBRE_TABLA, allcolumns,Reserva.COLUMNA_ID+"="+id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.close(); // se cierra la consulta
        return libro; //se devuelve la tabla

    }

}
