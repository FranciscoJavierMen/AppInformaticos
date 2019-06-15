package com.example.administrador.mismapas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener,
        View.OnClickListener{

    //Declaración de las vistas
    private Spinner spinner;
    private Button btnAceptar;
    private String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbarInicio);
        toolbar.setTitle("Inicio");
        setSupportActionBar(toolbar);

        inicializarComponentes();
        //Adaptador para el spinner con array de strings
        ArrayAdapter<CharSequence> adaptador  = ArrayAdapter.createFromResource(this,
                R.array.opcionesInicio, android.R.layout.simple_spinner_item);
        //Estableciendo el layout donde aparecerán los datos del spinner
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);
    }

    private void inicializarComponentes(){
        spinner = findViewById(R.id.spinnerInicio);
        btnAceptar = findViewById(R.id.btnInicio);
        btnAceptar.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        item = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnInicio:
                if (item.equals("Ciudad")){
                    startActivity(new Intent(this, Ciudades.class));
                }
                if (item.equals("Playa")){
                    startActivity(new Intent(this, Playas.class));
                }
                break;
                default:
                    break;
        }
    }
}
