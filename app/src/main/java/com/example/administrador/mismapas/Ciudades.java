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
import android.widget.RadioGroup;
import android.widget.Toast;


public class Ciudades extends AppCompatActivity implements
        View.OnClickListener
        {

    private Button btnCiudades;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5,
            checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    private String ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,
            ciudad6,ciudad7,ciudad8,ciudad9,ciudad10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);
        Toolbar toolbar = findViewById(R.id.toolbarCiudades);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        inicializarComponentes();
        //seleccionarCiudades();
    }

    private void inicializarComponentes(){
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);

        btnCiudades = findViewById(R.id.btnCiudades);
        btnCiudades.setOnClickListener(this);
    }

    private void seleccionarCiudades(){
        ciudad1 =  (checkBox1.isChecked() ? "ciudad1" : "");
        ciudad2 =  (checkBox2.isChecked() ? "ciudad2" : "");
        ciudad3 =  (checkBox3.isChecked() ? "ciudad3" : "");
        ciudad4 =  (checkBox4.isChecked() ? "ciudad4" : "");
        ciudad5 =  (checkBox5.isChecked() ? "ciudad5" : "");
        ciudad6 =  (checkBox6.isChecked() ? "ciudad6" : "");
        ciudad7 =  (checkBox7.isChecked() ? "ciudad7" : "");
        ciudad8 =  (checkBox8.isChecked() ? "ciudad8" : "");
        ciudad9 =  (checkBox9.isChecked() ? "ciudad9" : "");
        ciudad10 =  (checkBox10.isChecked() ? "ciudad10" : "");
    }

    private void enviarDirecciones(){
        Intent ciudades = new Intent(this, Mapa.class);
        ciudades.putExtra("ciudad1", ciudad1);
        ciudades.putExtra("ciudad2", ciudad2);
        ciudades.putExtra("ciudad3", ciudad3);
        ciudades.putExtra("ciudad4", ciudad4);
        ciudades.putExtra("ciudad5", ciudad5);
        ciudades.putExtra("ciudad6", ciudad6);
        ciudades.putExtra("ciudad7", ciudad7);
        ciudades.putExtra("ciudad8", ciudad8);
        ciudades.putExtra("ciudad9", ciudad9);
        ciudades.putExtra("ciudad10", ciudad10);

        startActivity(ciudades);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCiudades:
                seleccionarCiudades();
                enviarDirecciones();
                break;
                default:
                    break;
        }
    }
}
