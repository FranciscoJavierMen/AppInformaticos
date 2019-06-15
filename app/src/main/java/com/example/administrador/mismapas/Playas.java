package com.example.administrador.mismapas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Playas extends AppCompatActivity implements View.OnClickListener {

    private Button btnPlayas;

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5,
            checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    private String playa1,playa2,playa3,playa4,playa5,
            playa6,playa7,playa8,playa9,playa10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playas);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        inicializarComponentes();
    }

    private void inicializarComponentes(){
        checkBox1 = findViewById(R.id.checkBoxp1);
        checkBox2 = findViewById(R.id.checkBoxp2);
        checkBox3 = findViewById(R.id.checkBoxp3);
        checkBox4 = findViewById(R.id.checkBoxp4);
        checkBox5 = findViewById(R.id.checkBoxp5);
        checkBox6 = findViewById(R.id.checkBoxp6);
        checkBox7 = findViewById(R.id.checkBoxp7);
        checkBox8 = findViewById(R.id.checkBoxp8);
        checkBox9 = findViewById(R.id.checkBoxp9);
        checkBox10 = findViewById(R.id.checkBoxp10);

        btnPlayas = findViewById(R.id.btnPlayas);
        btnPlayas.setOnClickListener(this);
    }

    private void seleccionarPlayas(){
        playa1 =  (checkBox1.isChecked() ? "playa1" : "");
        playa2 =  (checkBox2.isChecked() ? "playa2" : "");
        playa3 =  (checkBox3.isChecked() ? "playa3" : "");
        playa4 =  (checkBox4.isChecked() ? "playa4" : "");
        playa5 =  (checkBox5.isChecked() ? "playa5" : "");
        playa6 =  (checkBox6.isChecked() ? "playa6" : "");
        playa7 =  (checkBox7.isChecked() ? "playa7" : "");
        playa8 =  (checkBox8.isChecked() ? "playa8" : "");
        playa9 =  (checkBox9.isChecked() ? "playa9" : "");
        playa10 =  (checkBox10.isChecked() ? "playa10" : "");
    }

    private void enviarDirecciones(){
        Intent ciudades = new Intent(this, Mapa2.class);
        ciudades.putExtra("playa1", playa1);
        ciudades.putExtra("playa2", playa2);
        ciudades.putExtra("playa3", playa3);
        ciudades.putExtra("playa4", playa4);
        ciudades.putExtra("playa5", playa5);
        ciudades.putExtra("playa6", playa6);
        ciudades.putExtra("playa7", playa7);
        ciudades.putExtra("playa8", playa8);
        ciudades.putExtra("playa9", playa9);
        ciudades.putExtra("playa10", playa10);

        startActivity(ciudades);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPlayas:
                seleccionarPlayas();
                enviarDirecciones();
                break;
                default:
                    break;
        }
    }
}
