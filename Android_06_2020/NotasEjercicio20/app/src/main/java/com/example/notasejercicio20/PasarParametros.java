package com.example.notasejercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class PasarParametros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametros);

        TextView tvNotaDefinitivaParametros = (TextView) findViewById(R.id.tvNotaDefinitivaParametros);

        //Se leen los parámetros del layout anterior
        Bundle oParametros = this.getIntent().getExtras();
        tvNotaDefinitivaParametros.setText(oParametros.getString("LaNotaFinal"));
    }
}
