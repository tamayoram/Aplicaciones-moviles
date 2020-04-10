package com.example.tallercondicionales32;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

import android.os.Bundle;

public class SegundoLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_layout);

        final Button obtnVolver = (Button) findViewById(R.id.btnVolver);

        obtnVolver.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oVolver = new Intent(SegundoLayout.this, MainActivity.class);
                startActivity(oVolver);

            }
        });

    }
}
