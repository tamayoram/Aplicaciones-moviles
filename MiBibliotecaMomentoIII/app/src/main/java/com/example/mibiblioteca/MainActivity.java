package com.example.mibiblioteca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//Invocar librerías
import android.view.View;
import android.widget.Button;//Manejar todo lo relacionado a los botones
import android.content.Intent;//Permite ir de un layout Al otro
import android.view.View.OnClickListener;//Crear eventos

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instanciamos a java las variables o controles del Layout
        final Button oBtnComenzar = (Button) findViewById(R.id.btnComenzar);
        //Ahora programamemos al Botón
        oBtnComenzar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ahora instanciamos la clase Intent
    Intent oLanzar = new Intent(MainActivity.this, LOpcionesDeLaAplicacion.class);
                startActivity(oLanzar);
            }
        });

    }
}
