package com.example.mibibliotecabasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button; // librería para administrar botones
import android.content.Intent; // librería para pasar de layout
import android.view.View.OnClickListener; // librería para activar eventos

public class LOpcionesAplicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_opciones_aplicacion);

        final Button oBtnOpcionAfiliado=(Button) findViewById(R.id.btnAfiliado); // reconocimiento de botones que se encuentran en los layout
        final Button oBtnOpcionLibro=(Button) findViewById(R.id.btnLibro);
        final Button oBtnOpcionReserva=(Button) findViewById(R.id.btnReserva);

        oBtnOpcionAfiliado.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { // evento para ir a otro layout
                Intent oLanzarAfiliado=new Intent(LOpcionesAplicacion.this,LAfiliado.class);
                startActivity(oLanzarAfiliado);
            }
        });

        oBtnOpcionLibro.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { // evento para ir a otro layout
                Intent oLanzarLibro=new Intent(LOpcionesAplicacion.this,LLibro.class);
                startActivity(oLanzarLibro);
            }
        });

        oBtnOpcionReserva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { // evento para ir a otro layout
                Intent oLanzarReserva=new Intent(LOpcionesAplicacion.this,LReserva.class);
                startActivity(oLanzarReserva);
            }
        });
    }
}
