package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;// programar botones

import android.widget.Toast; //librería para presentar mensajes en pantalla

import android.content.Intent;// programar movimientos entre layouts

import android.os.Bundle; //librería para llevar paramétros de un layout a otro

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText oedNombre = (EditText) findViewById(R.id.edNombre);
        final EditText oedNota1 = (EditText) findViewById(R.id.edNota1);
        final EditText oedNota2 = (EditText) findViewById(R.id.edNota2);
        final EditText oedNota3 = (EditText) findViewById(R.id.edNota3);
        final Button obtnDefinitiva = (Button) findViewById(R.id.btnDefinitiva);
        final Button obtnParametros = (Button) findViewById(R.id.btnParametros);
        final TextView otvResultado = (TextView) findViewById(R.id.tvResultado);

        final ClaseOperaciones oOperaciones=new ClaseOperaciones();

        obtnDefinitiva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double nota1 = 0;
                double nota2=0;
                double nota3=0;


                nota1 = Double.valueOf(oedNota1.getText().toString());
                nota2 = Double.valueOf(oedNota2.getText().toString());
                nota3 = Double.valueOf(oedNota3.getText().toString());

                if((nota1>=0 && nota1<=10)&&(nota2>=0 && nota2<=10)&&(nota3>=0 && nota3<=10)){
                otvResultado.setText(String.valueOf(oOperaciones.calcularDefinitiva(nota1, nota2, nota3)));
            }
                else{

                        Toast.makeText(MainActivity.this, "Por favor revisar las notas ingresadas",Toast.LENGTH_SHORT).show();
                        // código para generar mensaje en el celular
                }

            }

        });

        obtnParametros.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle oParametros=new Bundle(); //instanciar la clase bundle para llevar parámetros
                oParametros.putString("notaDefinitva",otvResultado.getText().toString());

                Intent oCambiarLayout = new Intent(MainActivity.this, pasarParametros.class);
                oCambiarLayout.putExtras(oParametros);
                startActivity(oCambiarLayout);

            }
        });


    }
}
