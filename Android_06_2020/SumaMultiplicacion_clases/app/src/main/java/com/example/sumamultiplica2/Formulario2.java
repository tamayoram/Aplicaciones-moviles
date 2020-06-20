package com.example.sumamultiplica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// llamado de librerías que se requieren para programar los controles

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Formulario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario2);

        // 3. Instanciar las clases de java y XML para que los controles que están en XML sean reconocidos por el lenguaje java

        final EditText oNumero1= (EditText) findViewById(R.id.edNum1); // creamos el objeto oNumero1 conectado con el layout
        final EditText oNumero2= (EditText) findViewById(R.id.edNum2);

        Button oBoton= (Button) findViewById(R.id.btnCalcular); //creamos el objeto oBoton conectado con el layout

        final TextView oSuma= (TextView) findViewById(R.id.tvSuma);
        final TextView oMultiplica= (TextView) findViewById(R.id.tvMultiplica); // lo controles en el layout son XML y con el objeto se conecta con java.

        oBoton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1=0; int n2=0;

                n1=Integer.valueOf(oNumero1.getText().toString()); // to string es para especificar que se esta pasando de un string al integer
                n2=Integer.valueOf(oNumero2.getText().toString());

                cOperacionesBasicas oOperaciones= new cOperacionesBasicas();


                oSuma.setText(String.valueOf(oOperaciones.Suma(n1,n2)));
                oMultiplica.setText(String.valueOf(oOperaciones.Multiplicacion(n1,n2)));



            }



        });




    }
}
