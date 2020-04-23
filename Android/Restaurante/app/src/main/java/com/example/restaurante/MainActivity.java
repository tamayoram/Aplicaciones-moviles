package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import android.view.View.OnClickListener;

import android.os.Bundle;

import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText oedCedula= (EditText) findViewById(R.id.edCedula);
        final EditText oedNombre= (EditText) findViewById(R.id.edNombre);
        final EditText oedApellido= (EditText) findViewById(R.id.edApellido);

        final RadioButton orbMasculino= (RadioButton) findViewById(R.id.rBMasculino);
        final RadioButton orbFemenino= (RadioButton) findViewById(R.id.rBFemenino);

        final Button obtOrdenar= (Button) findViewById(R.id.btnOrdenar);

        final RadioButton orbDesayuno= (RadioButton) findViewById(R.id.rBDesayuno);
        final RadioButton orbAlmuerzo= (RadioButton) findViewById(R.id.rBAlmuerzo);
        final RadioButton orbCena= (RadioButton) findViewById(R.id.rBCena);

        obtOrdenar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle oParametros= new Bundle();
                oParametros.putString("LaCedula",oedCedula.getText().toString());
                oParametros.putString("LosNombres",oedNombre.getText().toString());
                oParametros.putString("LosApellidos",oedApellido.getText().toString());

                String genero="";
                if(orbMasculino.isChecked()==true){

                    genero="Masculino";
                }
                else if(orbFemenino.isChecked()==true){
                    genero="Femenino";
                }

                oParametros.putString("ElGenero",genero);


            if(orbDesayuno.isChecked()==true){

                Intent oIrDesayuno= new Intent(MainActivity.this, Desayuno.class);
                oIrDesayuno.putExtras(oParametros);
                startActivity(oIrDesayuno);


            }
            else if(orbAlmuerzo.isChecked()==true){

                Intent oIrAlmuerzo= new Intent(MainActivity.this, Almuerzo.class);
                startActivity(oIrAlmuerzo);

            }
            else if(orbCena.isChecked()==true){

                Intent oIrCena= new Intent(MainActivity.this, Cena.class);
                startActivity(oIrCena);
            }

            }

        });

    }

    public void onrBFemeninoClicked(View view) {
        RadioButton orbMasculino= (RadioButton) findViewById(R.id.rBMasculino);
        RadioButton orbFemenino= (RadioButton) findViewById(R.id.rBFemenino);

        if(orbFemenino.isChecked()==true)
        {
            orbMasculino.setChecked(false);
        }
    }


    public void onrBMasculinoClicked(View view) {
        RadioButton orbMasculino= (RadioButton) findViewById(R.id.rBMasculino);
        RadioButton orbFemenino= (RadioButton) findViewById(R.id.rBFemenino);

        if(orbMasculino.isChecked()==true)
        {
            orbFemenino.setChecked(false);
        }

    }


    public void orBDesayunoChecked(View view) {
        RadioButton orbDesayuno= (RadioButton) findViewById(R.id.rBDesayuno);
        RadioButton orbAlmuerzo= (RadioButton) findViewById(R.id.rBAlmuerzo);
        RadioButton orbCena= (RadioButton) findViewById(R.id.rBCena);

        if(orbDesayuno.isChecked()==true)
        {
            orbAlmuerzo.setChecked(false);
            orbCena.setChecked(false);
        }
    }

    public void orBAlmuerzoChecked(View view) {
        RadioButton orbDesayuno= (RadioButton) findViewById(R.id.rBDesayuno);
        RadioButton orbAlmuerzo= (RadioButton) findViewById(R.id.rBAlmuerzo);
        RadioButton orbCena= (RadioButton) findViewById(R.id.rBCena);

        if(orbAlmuerzo.isChecked()==true)
        {
            orbDesayuno.setChecked(false);
            orbCena.setChecked(false);
        }
    }

    public void orBCenaChecked(View view) {
        RadioButton orbDesayuno= (RadioButton) findViewById(R.id.rBDesayuno);
        RadioButton orbAlmuerzo= (RadioButton) findViewById(R.id.rBAlmuerzo);
        RadioButton orbCena= (RadioButton) findViewById(R.id.rBCena);

        if(orbCena.isChecked()==true)
        {
            orbAlmuerzo.setChecked(false);
            orbDesayuno.setChecked(false);
        }
    }
}
