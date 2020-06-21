package com.example.mibiblioteca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//Invocar las librerías para trabajar con este Layout
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import java.sql.SQLException;//Permite capturar los errores de Base de Datos.

//Necesitamos invocar la librería donde están los campos de la tabla afiliado
//Necesitamos invocar la librería donde está la clase que contiene los métodos:
//ingresarafiliado, borrarafiliado, consultar, actualizar
import com.example.mibiblioteca.BaseDeDatos.DatabaseAfiliado; //Tiene los 4 métodos o CRUD
import com.example.mibiblioteca.Tablas.Afiliado;  //Los campos de la tabla afiliado.

public class LAfiliado extends AppCompatActivity {
    //Vamos a definir las siguientes variables a nivel de la clase para poderlas usar en
    //cualquier método de la clase.
    private DatabaseAfiliado dbAfiliado; //Nos va a permitir invocar cada método del CRUD
    String seleccion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lafiliado);
        //1. Vamos a abrir la Base de Datos y a validarla
        dbAfiliado = new DatabaseAfiliado(getApplicationContext());
                    //Sólo traigo el nombre de la DB y sus tablas
        //Ahora vamos a abrirla
        try
        {
            dbAfiliado.open();
        }
        catch (SQLException e)
        {
          e.printStackTrace();
        }
        //2. Instanciamos los controles de XML para convertirlos a java y poderlos programar
        //
        Button grabar = (Button) findViewById(R.id.btnGuardar);
        grabar.setOnClickListener(MetodoGrabarAfiliado);
        //Ahora vamos a instanciar el botón Consultar desde XML para java
        Button consultar = (Button) findViewById(R.id.btnConsultar);
        consultar.setOnClickListener(MetodoConsultarxId);

        //Botón para limpiar los datos
        Button oLimpiar = (Button) findViewById(R.id.btnLimpiar);
        oLimpiar.setOnClickListener(MetodoLimpiar);

    }

    public OnClickListener MetodoGrabarAfiliado = new OnClickListener() {
        @Override
        public void onClick(View v) {
           Afiliado oAfiliadoCampos = dbAfiliado.ingresarAfiliado(
             ((EditText) findViewById(R.id.etNombre)).getText().toString(),
             ((EditText) findViewById(R.id.etSexo)).getText().toString(),
             Boolean.parseBoolean(
                ((EditText) findViewById(R.id.etEstado)).getText().toString()
             ),
             ((EditText) findViewById(R.id.etCiudad)).getText().toString(),
             ((EditText) findViewById(R.id.etDireccion)).getText().toString(),
             ((EditText) findViewById(R.id.etTelefono)).getText().toString()
           );
        }
    };

    public OnClickListener MetodoConsultarxId = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Afiliado oConsultar = dbAfiliado.getAfiliado(
                    ((EditText)findViewById(R.id.etIdAfiliado)).getText().toString()
            );
            //Ahora vamos a revisar el objeto oConsultar qué datos nos trae para poderlos
            //mostrar en los EditText del Layout
            //
            ((EditText) findViewById(R.id.etNombre)).setText(oConsultar.getNombre());
            ((EditText) findViewById(R.id.etCiudad)).setText(oConsultar.getCiudad());
            ((EditText) findViewById(R.id.etSexo)).setText(oConsultar.getSexo());
            ((EditText) findViewById(R.id.etDireccion)).setText(oConsultar.getDireccion());
            ((EditText) findViewById(R.id.etTelefono)).setText(oConsultar.getTelefono());
            ((EditText) findViewById(R.id.etEstado)).setText(
               String.valueOf(
                       oConsultar.isEstado()
               )
            );

        }
    };

    public OnClickListener MetodoLimpiar = new OnClickListener() {
        @Override
        public void onClick(View v) {
            ((EditText) findViewById(R.id.etCiudad)).setText("");
            ((EditText) findViewById(R.id.etNombre)).setText("");
            ((EditText) findViewById(R.id.etEstado)).setText("");
            ((EditText) findViewById(R.id.etTelefono)).setText("");
            ((EditText) findViewById(R.id.etDireccion)).setText("");
            ((EditText) findViewById(R.id.etSexo)).setText("");
        }
    };
}
