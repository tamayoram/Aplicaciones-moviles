package com.example.mibibliotecabasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button; //Librería para trabajar con botones
import android.content.Intent; // librería para ir de un formulario a otro
import android.view.View.OnClickListener;//librería para utilizar los eventos

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button oComenzar= (Button) findViewById(R.id.btnComenzar); //Se llama al botón que se encuentra en el layout

        oComenzar.setOnClickListener(new OnClickListener() { //se utiliza el botón para definir el evento click
            @Override
            public void onClick(View v) {
                Intent oLanzar=new Intent(MainActivity.this,LOpcionesAplicacion.class); //se instancia una clase para ir del main al opciones.
                startActivity(oLanzar); // se activa la tarea de pasar de un layout a otro
            }
        });



    }
}
