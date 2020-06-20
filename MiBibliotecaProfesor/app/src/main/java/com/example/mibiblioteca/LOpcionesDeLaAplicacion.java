package com.example.mibiblioteca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//Invocar las librerías
import android.view.View;
import android.widget.Button;//Manejar todo lo relacionado a los botones
import android.content.Intent;//Permite ir de un layout Al otro
import android.view.View.OnClickListener;//Crear eventos

public class LOpcionesDeLaAplicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lopciones_de_la_aplicacion);
        //Programemos el código que nos permite ir a cada formulario de cada tabla.
        final Button btnOpcionAfiliado = (Button) findViewById(R.id.btnAfiliado);
        btnOpcionAfiliado.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a instanciar la clase Intent para ir al Layout lafiliado
                Intent oLanzarAfiliado = new Intent(LOpcionesDeLaAplicacion.this,
                        LAfiliado.class);
                startActivity(oLanzarAfiliado);
            }
        });
        final Button btnOpcionLibro = (Button) findViewById(R.id.btnLibro);
        btnOpcionLibro.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a instanciar la clase Intent para ir al Layout lalibro
                Intent oLanzarLibro = new Intent(LOpcionesDeLaAplicacion.this,
                        LLibro.class);
                startActivity(oLanzarLibro);
            }
        });
        final Button btnOpcionReserva = (Button) findViewById(R.id.btnReserva);
        btnOpcionReserva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a instanciar la clase Intent para ir al Layout lreserva
                Intent oLanzarReserva = new Intent(LOpcionesDeLaAplicacion.this,
                        LReserva.class);
                startActivity(oLanzarReserva);
            }
        });
    }
}
