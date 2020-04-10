package com.example.tallergeneral38;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText oedNumero = (EditText) findViewById(R.id.edNumero);
        final Button obtnCalcular = (Button) findViewById(R.id.btnCalcular);
        final TextView otvRaiz = (TextView) findViewById(R.id.tvRaiz);

        obtnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                float inicial = 0;
                float numero=0;

                numero = Float.valueOf(oedNumero.getText().toString());

                inicial=numero/2;

                cOperaciones oOPeraciones= new cOperaciones();

                otvRaiz.setText(String.valueOf(oOPeraciones.Raiz(numero)));

            }
        });


    }
}
