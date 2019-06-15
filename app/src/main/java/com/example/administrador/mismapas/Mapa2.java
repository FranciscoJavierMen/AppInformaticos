package com.example.administrador.mismapas;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private String playa1,playa2,playa3,playa4,playa5,
            playa6,playa7,playa8,playa9,playa10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        try{
            Intent i = getIntent();
            playa1 = i.getStringExtra("playa1");
            playa2 = i.getStringExtra("playa2");
            playa3 = i.getStringExtra("playa3");
            playa4 = i.getStringExtra("playa4");
            playa5 = i.getStringExtra("playa5");
            playa6 = i.getStringExtra("playa6");
            playa7 = i.getStringExtra("playa7");
            playa8 = i.getStringExtra("playa8");
            playa9 = i.getStringExtra("playa9");
            playa10 = i.getStringExtra("playa10");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void validar(String c1, String c2,String c3,String c4,String c5,
                         String c6,String c7,String c8,String c9,String c10) {

        if (TextUtils.isEmpty(c1) && TextUtils.isEmpty(c2) &&TextUtils.isEmpty(c3) && TextUtils.isEmpty(c4) &&
                TextUtils.isEmpty(c5) && TextUtils.isEmpty(c6) &&TextUtils.isEmpty(c7) && TextUtils.isEmpty(c8) &&
                TextUtils.isEmpty(c9) && TextUtils.isEmpty(c10)){
            Toast.makeText(this, "No se seleccionó ninguna playa", Toast.LENGTH_SHORT).show();

        }

        if (!TextUtils.isEmpty(c1)){
            LatLng ciudad = new LatLng(17.980951, -102.347326);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp1)));
        }

        if (!TextUtils.isEmpty(c2)){
            LatLng ciudad = new LatLng(21.169514, -86.810045);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp2)));
        }

        if (!TextUtils.isEmpty(c3)){
            LatLng ciudad = new LatLng(17.634574, -101.550270);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp3)));
        }

        if (!TextUtils.isEmpty(c4)){
            LatLng ciudad = new LatLng(20.635769, -87.063808);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp4)));
        }

        if (!TextUtils.isEmpty(c5)){
            LatLng ciudad = new LatLng(20.643740, -105.239288);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp5)));
        }

        if (!TextUtils.isEmpty(c6)) {
            LatLng ciudad = new LatLng(20.2215904, -87.3966201);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp6)));
        }

        if (!TextUtils.isEmpty(c7)){
            LatLng ciudad = new LatLng(20.680798, -105.289387);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp7)));
        }

        if (!TextUtils.isEmpty(c8)){
            LatLng ciudad = new LatLng(15.857397, -97.074766);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp8)));
        }

        if (!TextUtils.isEmpty(c9)){
            LatLng ciudad = new LatLng(20.321330, -96.864915);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp9)));
        }
        if (!TextUtils.isEmpty(c10)){
            LatLng ciudad = new LatLng(16.8382568, -99.8759167);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkboxp10)));
        }
        LatLng mexico = new LatLng(16.8362511, -99.8721313);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mexico, 5));
        mMap.getUiSettings().setAllGesturesEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        validar(playa1,playa2,playa3,playa4,playa5,playa6,playa7,playa8,playa9,playa10);
    }
}
