
//1. Es el principal y hace referencia al proyecto en general, es decir todo queda allí.
package com.example.aplicacion18032020;

//2. A continuación se invocan las librerías

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;  //Permite trabajar las propiedades de los Títulos.
import android.widget.Button;   //Permite programar los botones o colocar en ello los algoritmos
import android.widget.EditText;  //Permite leer datos.

import android.view.View.OnClickListener;  //Para poder crearle los eventos a los botones

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3. Programar
        //Vamos a instanciar los controles de XML en Java

        final EditText oedNumero1 = (EditText)    //Java
                findViewById(R.id.edNumero1);  //XML
        final EditText oedNumero2 = (EditText) findViewById(R.id.edNumero2);  // Java  y XML

        final Button obtnSumar = (Button) findViewById(R.id.btnSumar);
        final Button obtnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);

        final TextView otvSuma = (TextView) findViewById(R.id.tvSuma);
        final TextView otvMultiplicacr = (TextView) findViewById(R.id.tvMultiplicacion);

        //Para programar cualquier botón
        obtnSumar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int N1 = 0;
                int N2 = 0;
                int Suma = 0;
                N1 = Integer.valueOf(oedNumero1.getText().toString());
                N2 = Integer.valueOf(oedNumero2.getText().toString());
                Suma =  N1 + N2;
                otvSuma.setText(String.valueOf(Suma));
            }
        });


        obtnMultiplicar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int N1 = 0;
                int N2 = 0;
                int Multiplicacion = 0;
                N1 = Integer.valueOf(oedNumero1.getText().toString());
                N2 = Integer.valueOf(oedNumero2.getText().toString());
                Multiplicacion = N1 * N2;
                otvMultiplicacr.setText(String.valueOf(Multiplicacion));
            }
        });

    }
}
