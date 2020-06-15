package com.example.mibibliotecabasedatos.BaseDatos;

// Librerías para crear la base de datos y sus respectivas tablas.

import android.content.Context; // librería para crear la estructura de la BD
import android.database.sqlite.SQLiteDatabase; //librería para crear la estructura de cada tabla
import android.database.sqlite.SQLiteOpenHelper; // librería que permite reconocer los campos que van en las tablas

//Librería para llamar las tablas que se habían creado previamente
import com.example.mibibliotecabasedatos.tablas.Afiliado;
import com.example.mibibliotecabasedatos.tablas.Libro;
import com.example.mibibliotecabasedatos.tablas.Reserva;

//Código para crear la base de datos y las tablas
public class DataBaseHelper extends SQLiteOpenHelper
{

    private final static String DATABASE_NAME="bibliotecaMiercoles.db"; // creación de la base de datos
    private final static int DATABASE_VERSION=1; // definición de la versión

    public DataBaseHelper(Context context)
    { // se llama la libería context para crear la BD su estructura
        super(context, DATABASE_NAME,null, DATABASE_VERSION); //Instrucción para crear la BD debe tener nombre, versión y el null es para qu eel sistema defina el tamaño
    }

    @Override //sobrecargar métodos
    public void onCreate(SQLiteDatabase database){
    //instancia la librería SQLiteDatabase para utilizar las instrucciones para crear tablas
        database.execSQL(Afiliado.CREATE_TABLE); //crear la tabla afiliado
        database.execSQL(Libro.CREATE_TABLE); //crear la tabla libro
        database.execSQL(Reserva.CREATE_TABLE); //crear la tabla reserva

    }

    @Override //sobrecargar métodos
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    { // permite actualizar la informaciòn de bd y tablas. El argumento es para la BD, el nombre de la tabla y la versión.

    }

}
