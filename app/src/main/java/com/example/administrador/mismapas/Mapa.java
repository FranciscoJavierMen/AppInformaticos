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

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private String ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,
            ciudad6,ciudad7,ciudad8,ciudad9,ciudad10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        try{
            Intent i = getIntent();
            ciudad1 = i.getStringExtra("ciudad1");
            ciudad2 = i.getStringExtra("ciudad2");
            ciudad3 = i.getStringExtra("ciudad3");
            ciudad4 = i.getStringExtra("ciudad4");
            ciudad5 = i.getStringExtra("ciudad5");
            ciudad6 = i.getStringExtra("ciudad6");
            ciudad7 = i.getStringExtra("ciudad7");
            ciudad8 = i.getStringExtra("ciudad8");
            ciudad9 = i.getStringExtra("ciudad9");
            ciudad10 = i.getStringExtra("ciudad10");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void validar(String c1, String c2,String c3,String c4,String c5,
                         String c6,String c7,String c8,String c9,String c10) {

        if (TextUtils.isEmpty(c1) && TextUtils.isEmpty(c2) &&TextUtils.isEmpty(c3) && TextUtils.isEmpty(c4) &&
                TextUtils.isEmpty(c5) && TextUtils.isEmpty(c6) &&TextUtils.isEmpty(c7) && TextUtils.isEmpty(c8) &&
                TextUtils.isEmpty(c9) && TextUtils.isEmpty(c10)){
            Toast.makeText(this, "No se seleccionó ninguna ciudad", Toast.LENGTH_SHORT).show();

        }

        if (!TextUtils.isEmpty(c1)){
            LatLng ciudad = new LatLng(19.364522, -99.138199);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox1)));
        }

        if (!TextUtils.isEmpty(c2)){
            LatLng ciudad = new LatLng(20.674727, -103.335413);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox2)));
        }
        if (!TextUtils.isEmpty(c3)){
            LatLng ciudad = new LatLng(25.724222, -100.354545);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox3)));
        }
        if (!TextUtils.isEmpty(c4)){
            LatLng ciudad = new LatLng(19.0912769, -102.3585046);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox4)));
        }
        if (!TextUtils.isEmpty(c5)){
            LatLng ciudad = new LatLng(20.606645, -100.407817);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox5)));
        }
        if (!TextUtils.isEmpty(c6)){
            LatLng ciudad = new LatLng(19.694900, -101.204411);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox6)));
        }
        if (!TextUtils.isEmpty(c7)){
            LatLng ciudad = new LatLng(19.293118, -99.642888);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox7)));
        }
        if (!TextUtils.isEmpty(c8)){
            LatLng ciudad = new LatLng(24.031887, -104.650541);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox8)));
        }
        if (!TextUtils.isEmpty(c9)){
            LatLng ciudad = new LatLng(23.241346, -106.413010);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox9)));
        }
        if (!TextUtils.isEmpty(c10)){
            LatLng ciudad = new LatLng(17.958876, -102.202738);
            mMap.addMarker(new MarkerOptions().position(ciudad).title(getString(R.string.checkbox10)));
        }
        LatLng mexico = new LatLng(22.818974, -102.415019);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mexico, 5));
        mMap.getUiSettings().setAllGesturesEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        validar(ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,ciudad6,ciudad7,ciudad8,ciudad9,ciudad10);
    }
}
