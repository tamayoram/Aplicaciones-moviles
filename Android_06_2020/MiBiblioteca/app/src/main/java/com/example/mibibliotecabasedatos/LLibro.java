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

        Button oBtnConsultarLibro=(Button) findViewById(R.id.btnConsultarLibro);
        oBtnConsultarLibro.setOnClickListener(consultarLibro); //definición del método para consultar.

        Button oBtnEditarLibro=(Button) findViewById(R.id.btnEditarLibro);
        oBtnConsultarLibro.setOnClickListener(EditarLibro); //definición del método para consultar.


        Button oBtnLimpiarLibro=(Button) findViewById(R.id.btnLimpiarLibro);
        oBtnLimpiarLibro.setOnClickListener(limpiarLibro);// metodo para limpiar los controles.

    }

    //Crear
    public OnClickListener crearLibro =new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Libro oLibroCrear= dbLibro.IngresarLibro(
                    ((EditText) findViewById(R.id.etFePublica)).getText().toString(),
                    ((EditText) findViewById(R.id.etAutor)).getText().toString(),
                    Boolean.parseBoolean(((EditText) findViewById(R.id.etEstadoLibro)).getText().toString()),
                    ((EditText) findViewById(R.id.etTitulo)).getText().toString());

        }
    };

    //Editar

    public OnClickListener EditarLibro =new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Libro oLibroEditar= dbLibro.actualizarLibro(
                    ((EditText) findViewById(R.id.etIdLibro)).getText().toString(),
                    ((EditText) findViewById(R.id.etFePublica)).getText().toString(),
                    ((EditText) findViewById(R.id.etAutor)).getText().toString(),
                    Boolean.parseBoolean(((EditText) findViewById(R.id.etEstadoLibro)).getText().toString()),
                    ((EditText) findViewById(R.id.etTitulo)).getText().toString());
        }
    };



    //Consultar
    public OnClickListener consultarLibro=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Libro oLibroConsultar=dbLibro.getLibro(
                    ((EditText) findViewById(R.id.etIdLibro)).getText().toString());

            // Se muestran los datos en cada uno de los campos
            ((EditText) findViewById(R.id.etTitulo)).setText(oLibroConsultar.getTitulo());
            ((EditText) findViewById(R.id.etAutor)).setText(oLibroConsultar.getAutor());
            ((EditText) findViewById(R.id.etEstadoLibro)).setText(String.valueOf(oLibroConsultar.isEstado())); // el estado como llega booleano se debe convertir con string.valueof
            ((EditText) findViewById(R.id.etFePublica)).setText(oLibroConsultar.getFepublicacion());

        }
    };



    //Limpiar

    public OnClickListener limpiarLibro=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {

            ((EditText) findViewById(R.id.etTitulo)).setText("");
            ((EditText) findViewById(R.id.etAutor)).setText("");
            ((EditText) findViewById(R.id.etFePublica)).setText("");
            ((EditText) findViewById(R.id.etEstadoLibro)).setText("");

        }
    };
}
