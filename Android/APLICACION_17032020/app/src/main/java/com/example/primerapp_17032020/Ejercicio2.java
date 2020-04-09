package com.example.primerapp_17032020;
//Son librerías
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//1. Debemos llamar las librerías de los controles a utilizar
//A continuación vamos a invocar las librerías de los controles que requerimos programas
//EditText, para digitar valores, tenemos 2, pero pertenencen a una sola clase
//TextView, para colocar títulos
//Button, oara programar el algoritmo

import android.view.View;
import android.widget.EditText;  //Permite digitar información en sus controles.
import android.widget.TextView; //Permite trabajar los títulos de la APP
import android.widget.Button;  //Permite trabajar con botones.

//Necesitamos invocar la librería que nos permite crear los eventos para los controles.
import android.view.View.OnClickListener;



public class Ejercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        //2. Debemos instanciar las clases de Java y XML para poder tener acceso a cada control y programarlo.

        final EditText oedNumero1 = (EditText) findViewById(R.id.edtNumero1);
        final EditText oedNumero2 = (EditText) findViewById(R.id.edtNumero2);

        final Button oBtnCalcular = (Button) findViewById(R.id.btnCalcular);

        final TextView otvNumero1 = (TextView) findViewById(R.id.tvNumero1);
        final TextView otvNumero2 = (TextView) findViewById(R.id.tvNumero2);

        oBtnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                int N1=0; int N2=0;
                N1 =  Integer.valueOf(oedNumero1.getText().toString());
                N2 =  Integer.valueOf(oedNumero2.getText().toString());

                int Suma=0; int Multiplicacion=0;

                 //Ahora vamos a instanaciar la clase
                cOperacionesBasicas oOperaciones = new cOperacionesBasicas();

                Suma = oOperaciones.Suma(N1, N2);
                Multiplicacion = oOperaciones.Multiplicacion(N1, N2);

                otvNumero1.setText(String.valueOf(Suma));
                otvNumero2.setText(String.valueOf(Multiplicacion));

            }
        });



    }
}
