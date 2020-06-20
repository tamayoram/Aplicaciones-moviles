package com.example.notasejercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;  //Permite enviar o mandar parámetros o valores a otro layout

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

import android.widget.Toast; //Permite mostrar un mensaje controlado en el layout

import android.content.Intent; //Ir de un Laytout a otro.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText oedtNombre = (EditText) findViewById(R.id.edtNombre);
        final EditText oedtNota1 = (EditText) findViewById(R.id.edtNota1);
        final EditText oedtNota2 = (EditText) findViewById(R.id.edtNota2);
        final EditText oedtNota3 = (EditText) findViewById(R.id.edtNota3);

        Button obtnNotaDefinitiva = (Button) findViewById(R.id.btnNotaDefinitiva);
        Button obtnPasarParametros = (Button) findViewById(R.id.btnPasarParametros);

        final TextView otvNotaDefinitiva = (TextView) findViewById(R.id.tvNotaDefinitiva);

        obtnNotaDefinitiva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                String Nombre = "";
                double Nota1=0; double Nota2=0; double Nota3=0;

                Nombre = oedtNombre.getText().toString();
                Nota1 =  Double.valueOf(
                        oedtNota1.getText().toString()
                );
                Nota2 =  Double.valueOf(
                        oedtNota2.getText().toString()
                );
                Nota3 =  Double.valueOf(
                        oedtNota3.getText().toString()
                );

                if ((Nota1>=0 && Nota1<=10) && (Nota2>=0 && Nota2<=10) && (Nota3>=0 && Nota3<=10)) {
                    //Vamos a instanciar a la clase ClaseOperaciones
                    ClaseOperaciones oClaseOperaciones = new ClaseOperaciones();
                    otvNotaDefinitiva.setText(
                            String.valueOf(
                                    oClaseOperaciones.CacularNotaDefinitiva(Nota1, Nota2, Nota3)
                            )
                    );
                }
                else
                {
                    Toast.makeText(MainActivity.this,
                            "Por favor vuelva a ingresar las notas...",Toast.LENGTH_SHORT).show();
                }
            }
        });


        obtnPasarParametros.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cómo enviar parámetros de un layput a otro
                Bundle oParametros = new Bundle();
                //Cómo se crea un parámetro para ser enviado
                oParametros.putString("LaNotaFinal", otvNotaDefinitiva.getText().toString());

                Intent oLanzar = new Intent(MainActivity.this, PasarParametros.class);
                    oLanzar.putExtras(oParametros);
                startActivity(oLanzar);
            }
        });

    }
}
