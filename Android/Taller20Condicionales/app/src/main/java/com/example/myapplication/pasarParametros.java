package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import android.os.Bundle;

public class pasarParametros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametros);

        final TextView otvDefinitiva = (TextView) findViewById(R.id.tvDefinitiva);

        Bundle oParametros=this.getIntent().getExtras(); //preparar el layout para recibir los datos
        otvDefinitiva.setText(oParametros.getString("notaDefinitiva"));
    }
}
