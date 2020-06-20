package com.example.mibibliotecabasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button; //librería para manipular botones
import android.widget.EditText; //librería para manipular edit text
import android.view.View.OnClickListener; //librería para eventos
import java.sql.SQLException; // permite capturar los errores de la base de datos

import com.example.mibibliotecabasedatos.BaseDatos.DataBaseAfiliado; //Clase donde se encuentran las instrucciones para el CRUD
import com.example.mibibliotecabasedatos.tablas.Afiliado; //Clase donde están las instrucciones de la tabla afiliados


public class LAfiliado extends AppCompatActivity {

    private DataBaseAfiliado dbAfiliado; // permite administrar las instrucciones del CRUD
    String seleccionAfiliado=""; //variable para mostrar mensajes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_afiliado);

       dbAfiliado= new DataBaseAfiliado(getApplicationContext()); // instancia la variable dbAfiliado para que abra la BD
        try
        {
                dbAfiliado.open(); // se abre la base de datos y se capturan errores con la estructura try catch
        }
        catch (SQLException exception)
        {
            exception.printStackTrace(); // imprime mensaje de alerta si se presenta un error
        }




        Button oBtnCrearAfiliado=(Button) findViewById(R.id.btnCrear);
        Button oBtnConsultarAfiliado=(Button) findViewById(R.id.btnConsultar);
        //final Button oBtnEditarAfiliado=(Button) findViewById(R.id.btnEditar);
        //final Button oBtnEliminarAfiliado=(Button) findViewById(R.id.btnEliminar);
        final Button oBtnLimpiarAfiliado=(Button) findViewById(R.id.btnLimpiar);

         oBtnCrearAfiliado.setOnClickListener(crearAfiliado);// definición del método para crear.
         oBtnConsultarAfiliado.setOnClickListener(consultarAfiliado); //definición del método para consultar.
         oBtnLimpiarAfiliado.setOnClickListener(limpiarAfiliado);// metodo para limpiar los controles.



    }
    //Crear
    public OnClickListener crearAfiliado=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Afiliado oAfiliadoCrear= dbAfiliado.IngresarAfiliado(
                    ((EditText) findViewById(R.id.etNombre)).getText().toString(),
                    ((EditText) findViewById(R.id.etGenero)).getText().toString(),
                    Boolean.parseBoolean(((EditText) findViewById(R.id.etEstado)).getText().toString()),
                    ((EditText) findViewById(R.id.etCiudad)).getText().toString(),
                    ((EditText) findViewById(R.id.etDireccion)).getText().toString(),
                    ((EditText) findViewById(R.id.etTelefono)).getText().toString());

        }
    };
    //Consultar
    public OnClickListener consultarAfiliado=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Afiliado oAfiliadoConsultar=dbAfiliado.getAfiliado(
                    ((EditText) findViewById(R.id.etId)).getText().toString());

            // Se muestran los datos en cada uno de los campos
            ((EditText) findViewById(R.id.etNombre)).setText(oAfiliadoConsultar.getNombre());
            ((EditText) findViewById(R.id.etGenero)).setText(oAfiliadoConsultar.getSexo());
            ((EditText) findViewById(R.id.etEstado)).setText(String.valueOf(oAfiliadoConsultar.isEstado())); // el estado como llega booleano se debe convertir con string.valueof
            ((EditText) findViewById(R.id.etCiudad)).setText(oAfiliadoConsultar.getCiudad());
            ((EditText) findViewById(R.id.etDireccion)).setText(oAfiliadoConsultar.getDireccion());
            ((EditText) findViewById(R.id.etTelefono)).setText(oAfiliadoConsultar.getTelefono());
        }
    };

    //Limpiar

    public OnClickListener limpiarAfiliado=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {

            ((EditText) findViewById(R.id.etNombre)).setText("");
            ((EditText) findViewById(R.id.etGenero)).setText("");
            ((EditText) findViewById(R.id.etEstado)).setText("");
            ((EditText) findViewById(R.id.etCiudad)).setText("");
            ((EditText) findViewById(R.id.etDireccion)).setText("");
            ((EditText) findViewById(R.id.etTelefono)).setText("");

        }
    };



}
