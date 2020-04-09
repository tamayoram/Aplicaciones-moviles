package com.example.varioslayouts;

import androidx.appcompat.app.AppCompatActivity;

//Debemos primero llamar las librerías para poder
//programar los controles.
//
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
//Permite crear eventos a los controles
//
import android.view.View.OnClickListener;
//Vamos a invocar la librería que permite ir de un Layout a otro
//
//Permite ir de un Layout a otro.
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos los controles que vamos a programar
        //
        Button obtnSegundo = (Button) findViewById(R.id.btnSegundo);
        Button obtnTercero = (Button) findViewById(R.id.btnTercero);



        obtnSegundo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent oLanzar = new Intent(MainActivity.this, SegundoLayout.class);
              startActivity(oLanzar);


            }
        });

        obtnTercero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oTercero = new Intent(MainActivity.this, Tercero.class   );
                startActivity(oTercero);
            }
        });


    }
}
