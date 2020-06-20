package com.example.sumamultiplicacion;

// Importar las librerías necesarias para realizar la aplicación

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView; //Permite trabajar las propiedades de los títulos
import android.widget.Button; //Permite programar los botones o colocar en ellos los algoritmos
import android.widget.EditText;  //Permite leer datos.
import android.view.View.OnClickListener;  //Para poder crearle los eventos a los botones

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciar los controles de XML en Java

        final EditText oednum1=(EditText) //Java
                findViewById(R.id.ednum1); //XML
        final EditText oednum2=(EditText)
                findViewById(R.id.ednum2);

        final Button obtnSumar=(Button)
                findViewById(R.id.btnSumar);
        final Button obtnMultiplicar=(Button)
                findViewById(R.id.btnMultiplicar);

        final TextView otvSuma=(TextView)
                findViewById(R.id.tvSuma);
        final TextView otvMultiplicacion=(TextView)
                findViewById(R.id.tvMultiplicacion);

        // programar el botón de suma

        obtnSumar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=0;
                int n2=0;
                int suma=0;

                n1= Integer.valueOf(oednum1.getText().toString());
                n2= Integer.valueOf(oednum2.getText().toString());

                suma=n1+n2;

                otvSuma.setText(String.valueOf(suma));
            }
        });

        //programar el botón multiplicar. Se debe realizar todo el procedimiento completo declarar e inicializar las variables

        obtnMultiplicar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=0;
                int n2=0;
                int multiplica=0;

                n1= Integer.valueOf(oednum1.getText().toString());
                n2= Integer.valueOf(oednum2.getText().toString());

                multiplica=n1*n2;

                otvMultiplicacion.setText(String.valueOf(multiplica));
            }
        });
    }
}
