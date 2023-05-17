package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Pantalla_Carga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_carga);

        final int DURACION= 3000; /*tiempo para ejecucion de la pantalla de carga (en segundos)*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            /* SE COLOCATODO LO QUE SE VAYA A EJECUTAR DESPUES DE LOS 3 SEG */
               Intent intent = new Intent(Pantalla_Carga.this,MainActivity.class);
               startActivity(intent);
               finish();
            }
        },DURACION);
    }
}