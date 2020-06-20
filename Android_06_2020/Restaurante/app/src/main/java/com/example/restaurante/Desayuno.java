package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.CheckBox;

public class Desayuno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno);

        TextView otvCedula= (TextView) findViewById(R.id.tvCedula);
        TextView otvNombre= (TextView) findViewById(R.id.tvNombre);
        TextView otvApellido= (TextView) findViewById(R.id.tvApellido);
        TextView otvGenero= (TextView) findViewById(R.id.tvGenero);

        Bundle oParametrosRecibidos=this.getIntent().getExtras();

        otvCedula.setText(oParametrosRecibidos.getString("LaCedula"));
        otvNombre.setText(oParametrosRecibidos.getString("LosNombres"));
        otvApellido.setText(oParametrosRecibidos.getString("LosApellidos"));
        otvGenero.setText(oParametrosRecibidos.getString("ElGenero"));
    }
}
