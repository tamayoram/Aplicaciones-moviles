package com.example.mibibliotecabasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button; //librería para manipular botones
import android.widget.EditText; //librería para manipular edit text
import android.view.View.OnClickListener; //librería para eventos
import java.sql.SQLException; // permite capturar los errores de la base de datos

import com.example.mibibliotecabasedatos.BaseDatos.DataBaseLibro; //Clase donde se encuentran las instrucciones para el CRUD
import com.example.mibibliotecabasedatos.tablas.Libro; //Clase donde están las instrucciones de la tabla afiliados


public class LLibro extends AppCompatActivity {

    private DataBaseLibro dbLibro; // permite administrar las instrucciones del CRUD
    String seleccionLibro=""; //variable para mostrar mensajes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_libro);

        dbLibro= new DataBaseLibro(getApplicationContext()); // instancia la variable dbAfiliado para que abra la BD
        try
        {
            dbLibro.open(); // se abre la base de datos y se capturan errores con la estructura try catch
        }
        catch (SQLException exception)
        {
            exception.printStackTrace(); // imprime mensaje de alerta si se presenta un error
        }

        Button oBtnCrearLibro=(Button) findViewById(R.id.btnCrearLibro);
        oBtnCrearLibro.setOnClickListener(crearLibro);// definición del método para crear.

    }

    //Crear
    public OnClickListener crearLibro =new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Libro oAfiliadoLibro= dbLibro.IngresarLibro(
                    ((EditText) findViewById(R.id.etFePublica)).getText().toString(),
                    ((EditText) findViewById(R.id.etAutor)).getText().toString(),
                    Boolean.parseBoolean(((EditText) findViewById(R.id.etEstadoLibro)).getText().toString()),
                    ((EditText) findViewById(R.id.etTitulo)).getText().toString());

        }
    };
}
