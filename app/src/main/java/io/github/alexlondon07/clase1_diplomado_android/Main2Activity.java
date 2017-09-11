package io.github.alexlondon07.clase1_diplomado_android;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import io.github.alexlondon07.clase1_diplomado_android.model.Persona;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getDataActivity1();
    }

    public void getDataActivity1(){
        Intent intent =  getIntent();
        String tag = intent.getStringExtra("tag");

        Persona persona = (Persona) intent.getSerializableExtra("persona");
        Toast.makeText(this, "Hola: " + persona.getNombre() + persona.getApellido() + " estas en el diplomado de " + tag, Toast.LENGTH_SHORT).show();

    }
}
