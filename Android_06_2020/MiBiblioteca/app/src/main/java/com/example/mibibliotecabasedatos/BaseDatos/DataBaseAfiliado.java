package com.example.mibibliotecabasedatos.BaseDatos;

import java.util.ArrayList;
import java.util.List;

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

        Cursor cursor = database.query(Afiliado.NOMBRE_TABLA,
                allcolumns, Afiliado.COLUMNA_ID + " = " + insertId,
                null,
                null, null, null);
        cursor.moveToFirst();
        Afiliado newAfiliado = cursorToAfiliado(cursor);
        cursor.close();
        return newAfiliado;

        //return null; // retornar una respuesta que ya quedo grabada.
    }

    // borrar (delete)
    public Afiliado borrarAfiliado(String id)
    {
        System.out.println("Afiliado borrado con id: " + id);
        database.delete(Afiliado.NOMBRE_TABLA,Afiliado.COLUMNA_ID +" = "+ id,null); // instrucción para borar, el null es para decir que no voy a utilizar más condiciones.
        //Si necesito otra condiciones las voy agregando y cierro con null cuando finalice.

        return null;
    }

    // actualizar (update)
    public Afiliado actualizarAfiliado(String id, String nombre, String sexo, boolean estado, String ciudad, String direccion, String telefono)
    {
        ContentValues values=new ContentValues();
        values.put(Afiliado.COLUMNA_NOMBRE,nombre); // esta instrucciones son para insertar los valores en la base de datos
        values.put(Afiliado.COLUMNA_SEXO,sexo);
        values.put(Afiliado.COLUMNA_ESTADO,estado);
        values.put(Afiliado.COLUMNA_CIUDAD,ciudad);
        values.put(Afiliado.COLUMNA_DIRECCION,direccion);
        values.put(Afiliado.COLUMNA_TELEFONO,telefono);

        database.update(Afiliado.NOMBRE_TABLA,values,Afiliado.COLUMNA_ID +" = "+ id,null);
        return null;
    }

    //consultar o leer (read)

    public Afiliado getAfiliado(String id)
    {
        Afiliado afiliado= null; //inicialización del objeto afiliado
        Cursor cursor= database.query(Afiliado.NOMBRE_TABLA, allcolumns,Afiliado.COLUMNA_ID +" = "+ id,null,null,null,null); // un cursor es una tabla
        // se define tabla, todas las columnas, se filtra por ID, los null es para definir los argumentos que faltan

        cursor.moveToFirst();
        if (!cursor.isAfterLast()) {
            afiliado = cursorToAfiliado(cursor);
        }

        cursor.close(); // se cierra la consulta
        return afiliado; //se devuelve la tabla

    }

    // código de la librería cursor
    public List<Afiliado> getAllAfiliados() {
        List<Afiliado> afiliados = new ArrayList<Afiliado>();
        Cursor cursor = database.query(Afiliado.NOMBRE_TABLA,
                allcolumns, null, null, null,
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

}
