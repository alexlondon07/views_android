package io.github.alexlondon07.clase1_diplomado_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.alexlondon07.clase1_diplomado_android.model.Persona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        Persona persona = new Persona();
        persona.setNombre("Alexander");
        persona.setApellido("Londoño Espejo");

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("persona", persona);
        intent.putExtra("tag", "Android");
        startActivity(intent);
    }

    public void onClickAnimals(View view){

        Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
        startActivity(intent);

    }

    public void onClickProfile(View view){
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
