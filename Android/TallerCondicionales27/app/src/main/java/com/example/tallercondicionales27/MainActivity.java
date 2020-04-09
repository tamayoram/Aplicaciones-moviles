
//1. Es el principal y hace referencia al proyecto en general.
package com.example.tallercondicionales27;

//2. A continuación se invocan las librerías
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3. Programación de los controles

        final EditText oedEdad = (EditText) findViewById(R.id.edEdad);
        final EditText oedSexo = (EditText) findViewById(R.id.edSexo);
        final Button obtnCalcular = (Button) findViewById(R.id.btnCalcular);
        final Button obtnCambio = (Button) findViewById(R.id.btnCambio);
        final TextView otvResultado = (TextView) findViewById(R.id.tvResultado);

        //4. Programación de los botones
        obtnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                float pulsaciones = 0;
                int edad=0;
                int sexo=0; // sexo 0= hombre, sexo 1= mujeres

                edad = Integer.valueOf(oedEdad.getText().toString());
                sexo = Integer.valueOf(oedSexo.getText().toString());

                if (sexo==0){
                    pulsaciones= (float) (210-edad)/10;
                }
                else if(sexo==1){
                    pulsaciones= (float) (220-edad)/10;
                }
                otvResultado.setText(String.valueOf(pulsaciones));
            }
        });

        obtnCambio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oCambiarLayout = new Intent(MainActivity.this, SegundoLayout.class);
                startActivity(oCambiarLayout);

            }
        });

    }
}
