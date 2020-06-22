package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList; // librería para manejar vectores
import java.util.List; // recuperar datos de la BD

import android.content.ContentValues; //librería para enviar datos a la BD
import android.content.Context; //librería para manejar la base de datos
import android.database.Cursor;
import android.service.restrictions.RestrictionsReceiver;

import com.example.mibibliotecabasedatos.tablas.Reserva;

public class DataBaseReserva extends DataBaseAccess {
    private static String[] allcolumns={Reserva.COLUMNA_ID,Reserva.COLUMNA_AFILIADO,Reserva.COLUMNA_LIBRO,Reserva.COLUMNA_FEENTREGA}; // vector con la información de campos para libro

    public DataBaseReserva(Context context)
    {
        super(context); // abrir la base de datos de libro

    }
    //grabar (create)
    public Reserva IngresarReserva(String afiliado,String libro, String feentrega)
    {
        ContentValues values=new ContentValues();
        values.put(Reserva.COLUMNA_AFILIADO,afiliado);
        values.put(Reserva.COLUMNA_LIBRO,libro); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Reserva.COLUMNA_FEENTREGA,feentrega);

        long insertId= database.insert(Reserva.NOMBRE_TABLA,null,values); // instrucción para grabar los values de arriba.

        Cursor cursor = database.query(Reserva.NOMBRE_TABLA,
                allcolumns, Reserva.COLUMNA_ID + " = " + insertId,
                null,
                null, null, null);
        cursor.moveToFirst();
        Reserva newReserva = cursorToReserva(cursor);
        cursor.close();
        return newReserva; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public Reserva borrarReserva(String id)
    {
        database.delete(Reserva.NOMBRE_TABLA,Reserva.COLUMNA_ID + " = " + id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.
        return null;
    }

    // actualizar (update)
    public Reserva actualizarReserva(String id, String afiliado, String libro, String feentrega)
    {
        ContentValues values=new ContentValues();
        values.put(Reserva.COLUMNA_AFILIADO,afiliado);
        values.put(Reserva.COLUMNA_LIBRO,libro); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Reserva.COLUMNA_FEENTREGA,feentrega);

        database.update(Reserva.NOMBRE_TABLA,values,Reserva.COLUMNA_ID + " = " + id,null);

        return null;
    }

    //consultar o leer (read)

    public Reserva getReserva(String id)
    {
        Reserva reserva= null; //inicialización del objeto libro
        Cursor cursor= database.query(Reserva.NOMBRE_TABLA, allcolumns,Reserva.COLUMNA_ID + " = " + id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.moveToFirst();
        if (!cursor.isAfterLast()) {
            reserva = cursorToReserva(cursor);
        }

        cursor.close(); // se cierra la consulta
        return reserva; //se devuelve la tabla

    }

    // código de la librería cursor
    public List<Reserva> getAllReserva() {
        List<Reserva> reservas = new ArrayList<Reserva>();
        Cursor cursor = database.query(Reserva.NOMBRE_TABLA,
                allcolumns, null, null, null,
                null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Reserva reserva = cursorToReserva(cursor);
            reservas.add(reserva);
            cursor.moveToNext();
        }
        cursor.close();
        return reservas;
    }

    private static Reserva cursorToReserva(Cursor cursor) {
        Reserva reserva = new Reserva();
        reserva.setId(cursor.getString(0));
        reserva.setAfiliado(cursor.getString(1));
        reserva.setLibro(cursor.getString(2));
        reserva.setFeentrega(cursor.getString(3));

        return reserva;
    }

}
