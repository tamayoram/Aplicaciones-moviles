package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList; // librería para manejar vectores
import java.util.List; // recuperar datos de la BD

import android.content.ContentValues; //librería para enviar datos a la BD
import android.content.Context; //librería para manejar la base de datos
import android.database.Cursor;

import com.example.mibibliotecabasedatos.tablas.Afiliado;

public class DataBaseAfiliado extends DataBaseAccess {

    private final static String[] allcolumns={Afiliado.COLUMNA_ID,Afiliado.COLUMNA_NOMBRE,Afiliado.COLUMNA_SEXO, Afiliado.COLUMNA_ESTADO, Afiliado.COLUMNA_CIUDAD,Afiliado.COLUMNA_DIRECCION,
    Afiliado.COLUMNA_TELEFONO}; // vector con la información de campos para afiliados

    public DataBaseAfiliado(Context context)
    {
        super(context); // abrir la base de datos de afiliado

    }
    //grabar (create)
    public Afiliado IngresarAfiliado(String nombre, String sexo, boolean estado,String ciudad, String direccion, String telefono)
    {
        ContentValues values=new ContentValues();
        values.put(Afiliado.COLUMNA_NOMBRE,nombre); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Afiliado.COLUMNA_SEXO,sexo);
        values.put(Afiliado.COLUMNA_ESTADO,estado);
        values.put(Afiliado.COLUMNA_CIUDAD,ciudad);
        values.put(Afiliado.COLUMNA_DIRECCION,direccion);
        values.put(Afiliado.COLUMNA_TELEFONO,telefono);

        long insertId= database.insert(Afiliado.NOMBRE_TABLA,null,values); // instrucción para grabar los values de arriba.

        return null; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public void borrarAfiliado(String id)
    {
        database.delete(Afiliado.NOMBRE_TABLA,Afiliado.COLUMNA_ID +" = "+ id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.
    }

    // actualizar (update)
    public void actualizarAfiliado(String id,String nombre, String sexo, boolean estado,String ciudad, String direccion, String telefono)
    {
        ContentValues values=new ContentValues();
        values.put(Afiliado.COLUMNA_NOMBRE,nombre); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Afiliado.COLUMNA_SEXO,sexo);
        values.put(Afiliado.COLUMNA_ESTADO,estado);
        values.put(Afiliado.COLUMNA_CIUDAD,ciudad);
        values.put(Afiliado.COLUMNA_DIRECCION,direccion);
        values.put(Afiliado.COLUMNA_TELEFONO,telefono);


        database.update(Afiliado.NOMBRE_TABLA,values,Afiliado.COLUMNA_ID +" = "+ id,null);
    }

    //consultar o leer (read)

    public Afiliado getAfiliado(String id)
    {
        Afiliado afiliado= null; //inicialización del objeto afiliado
        Cursor cursor= database.query(Afiliado.NOMBRE_TABLA, allcolumns,Afiliado.COLUMNA_ID +" = "+ id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.close(); // se cierra la consulta
        return afiliado; //se devuelve la tabla

    }

}
