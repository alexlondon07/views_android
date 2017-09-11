package io.github.alexlondon07.clase1_diplomado_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner synSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        loadDataSync();
    }

    public void loadDataSync(){
        synSpinner = (Spinner) findViewById(R.id.activiy_profile_spinner_syn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(ProfileActivity.this, R.array.syn_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        synSpinner.setAdapter(adapter);
        synSpinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
