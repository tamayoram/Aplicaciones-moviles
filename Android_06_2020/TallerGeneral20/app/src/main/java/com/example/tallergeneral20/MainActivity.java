package com.example.tallergeneral20;

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

        final EditText oedNumerador = (EditText) findViewById(R.id.edNumerador);
        final EditText oedDenominador = (EditText) findViewById(R.id.edDenominador);
        final Button obtnCalcular = (Button) findViewById(R.id.btnCalcular);
        final Button obtnCambiar = (Button) findViewById(R.id.btnCambiar);
        final TextView otvResiduo = (TextView) findViewById(R.id.tvResiduo);
        final TextView otvCociente = (TextView) findViewById(R.id.tvCociente);

        obtnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int residuo = 0;
                int numerador=0;
                int denominador=0;


                numerador = Integer.valueOf(oedNumerador.getText().toString());
                denominador = Integer.valueOf(oedDenominador.getText().toString());


                cOperaciones oOPeraciones= new cOperaciones();

                otvResiduo.setText(String.valueOf(oOPeraciones.Residuo(numerador,denominador)));
                otvCociente.setText(String.valueOf(oOPeraciones.Cociente(numerador,denominador)));
            }
        });

        obtnCambiar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oCambiarLayout = new Intent(MainActivity.this, SegundoLayout.class);
                startActivity(oCambiarLayout);

            }
        });

    }
}
