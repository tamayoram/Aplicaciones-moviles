package com.example.tallercondicionales32;

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

        final EditText oedVentas = (EditText) findViewById(R.id.edVentas);
        final EditText oedPago = (EditText) findViewById(R.id.edPago);
        final Button obtnCalcular = (Button) findViewById(R.id.btnCalcular);
        final Button obtnCambio = (Button) findViewById(R.id.btnCambio);
        final TextView otvDescuento = (TextView) findViewById(R.id.tvDescuento);
        final TextView otvPago = (TextView) findViewById(R.id.tvPago);

        obtnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                float descuento = 0;
                float venta=0;
                float valorPagado=0;
                int metodo=0; // metodo 0= efectivo, metodo 1= tarjeta

                venta = Float.valueOf(oedVentas.getText().toString());
                metodo = Integer.valueOf(oedPago.getText().toString());

                if (venta<=100000){

                    if (metodo==0){
                        descuento= (float) (venta*0.2);
                        valorPagado=venta-descuento;
                    }
                    else if(metodo==1){
                        descuento= (float) (venta*0.1);
                        valorPagado=venta-descuento;
                    }
                }

                else if(venta<=200000){
                    if (metodo==0){
                        descuento= (float) (venta*0.3);
                        valorPagado=venta-descuento;
                    }
                    else if(metodo==1){
                        descuento= (float) (venta*0.15);
                        valorPagado=venta-descuento;
                    }
                }

                else{
                    if (metodo==0){
                        descuento= (float) (venta*0.4);
                        valorPagado=venta-descuento;
                    }
                    else if(metodo==1){
                        descuento= (float) (venta*0.2);
                        valorPagado=venta-descuento;
                    }
                }
                otvDescuento.setText(String.valueOf(descuento));
                otvPago.setText(String.valueOf(valorPagado));
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
