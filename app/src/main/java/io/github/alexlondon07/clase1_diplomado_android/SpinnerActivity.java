package io.github.alexlondon07.clase1_diplomado_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner animalsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        loadDataSpinner();
    }

    private void loadDataSpinner(){
        animalsSpinner = (Spinner) findViewById(R.id.spinneractivity_animals);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(SpinnerActivity.this, R.array.animals_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        animalsSpinner.setAdapter(adapter);

        animalsSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String animal =  (String) adapterView.getSelectedItem();
        Toast.makeText(this, animal, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
