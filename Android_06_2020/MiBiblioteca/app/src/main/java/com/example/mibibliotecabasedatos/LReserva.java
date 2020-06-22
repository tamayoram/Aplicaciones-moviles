package com.example.mibibliotecabasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button; //librería para manipular botones
import android.widget.EditText; //librería para manipular edit text
import android.view.View.OnClickListener; //librería para eventos
import java.sql.SQLException; // permite capturar los errores de la base de datos

import com.example.mibibliotecabasedatos.BaseDatos.DataBaseReserva; //Clase donde se encuentran las instrucciones para el CRUD
import com.example.mibibliotecabasedatos.tablas.Reserva;

public class LReserva extends AppCompatActivity {

    private DataBaseReserva dbReserva; // permite administrar las instrucciones del CRUD
    String seleccionReserva=""; //variable para mostrar mensajes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_reserva);

        dbReserva= new DataBaseReserva(getApplicationContext()); // instancia la variable dbAfiliado para que abra la BD
        try
        {
            dbReserva.open(); // se abre la base de datos y se capturan errores con la estructura try catch
        }
        catch (SQLException exception)
        {
            exception.printStackTrace(); // imprime mensaje de alerta si se presenta un error
        }

        Button oBtnCrearReserva=(Button) findViewById(R.id.btnCrearReserva);
        oBtnCrearReserva.setOnClickListener(crearReserva);// definición del método para crear.

        Button oBtnConsultarReserva=(Button) findViewById(R.id.btnConsultarReserva);
        oBtnConsultarReserva.setOnClickListener(consultarReserva); //definición del método para consultar.

        Button oBtnEditarReserva=(Button) findViewById(R.id.btnEditarReserva);
        oBtnEditarReserva.setOnClickListener(EditarReserva); //definición del método para consultar.

        Button oBtnEliminarReserva=(Button) findViewById(R.id.btnEliminarReserva);
        oBtnEliminarReserva.setOnClickListener(EliminarReserva); //definición del método para consultar.

        Button oBtnLimpiarReserva=(Button) findViewById(R.id.btnLimpiarReserva);
        oBtnLimpiarReserva.setOnClickListener(limpiarReserva);// metodo para limpiar los controles.
    }

    //Crear
    public OnClickListener crearReserva =new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Reserva oReservaCrear= dbReserva.IngresarReserva(
                    ((EditText) findViewById(R.id.etAfiliadoReserva)).getText().toString(),
                    ((EditText) findViewById(R.id.etLibroReserva)).getText().toString(),
                    ((EditText) findViewById(R.id.etFeEntregaReserva)).getText().toString()
            );
        }
    };

    //Editar

    public OnClickListener EditarReserva =new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Reserva oReservaEditar= dbReserva.actualizarReserva(
                    ((EditText) findViewById(R.id.etIdReserva)).getText().toString(),
                    ((EditText) findViewById(R.id.etAfiliadoReserva)).getText().toString(),
                    ((EditText) findViewById(R.id.etLibroReserva)).getText().toString(),
                    ((EditText) findViewById(R.id.etFeEntregaReserva)).getText().toString()

            );
        }
    };

    //Consultar
    public OnClickListener consultarReserva=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Reserva oReservaConsultar=dbReserva.getReserva(
                    ((EditText) findViewById(R.id.etIdReserva)).getText().toString());

            // Se muestran los datos en cada uno de los campos
            ((EditText) findViewById(R.id.etAfiliadoReserva)).setText(oReservaConsultar.getAfiliado());
            ((EditText) findViewById(R.id.etLibroReserva)).setText(oReservaConsultar.getLibro());
            ((EditText) findViewById(R.id.etFeEntregaReserva)).setText(oReservaConsultar.getFeentrega());

        }
    };

    //Eliminar

    public OnClickListener EliminarReserva=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {
            Reserva oReservaEliminar=dbReserva.borrarReserva(
                    ((EditText) findViewById(R.id.etIdReserva)).getText().toString());
        }
    };

    //Limpiar

    public OnClickListener limpiarReserva=new OnClickListener() { // instrucciones para programar el evento click cuando es con base de datos
        @Override
        public void onClick(View v) {

            ((EditText) findViewById(R.id.etAfiliadoReserva)).setText("");
            ((EditText) findViewById(R.id.etLibroReserva)).setText("");
            ((EditText) findViewById(R.id.etFeEntregaReserva)).setText("");

        }
    };
}
