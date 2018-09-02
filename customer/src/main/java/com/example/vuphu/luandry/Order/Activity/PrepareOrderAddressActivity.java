package com.example.vuphu.luandry.Order.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.vuphu.luandry.R;
import com.mapfit.android.MapView;
import com.mapfit.android.Mapfit;
import com.mapfit.android.MapfitMap;
import com.mapfit.android.OnMapReadyCallback;
import com.mapfit.android.annotations.MapfitMarker;
import com.mapfit.android.annotations.MarkerOptions;
import com.mapfit.android.geometry.LatLng;
import com.mapfit.android.location.LocationPriority;

import org.jetbrains.annotations.NotNull;

public class PrepareOrderAddressActivity extends AppCompatActivity {

    public static final int LOCATION_PERMISSION_REQUEST_CODE = 99;
    public static final String MAP_API_KEY = "591dccc4e499ca0001a4c6a468d0230a15d34cefbe1636563804093e";
    MapView mapView;
    MapfitMap mapfitMap;
    private EditText pickUp,dropOff;

    private FloatingActionButton prepareBack, prepareNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapfit.getInstance(this, MAP_API_KEY);
        setContentView(R.layout.activity_prepare_order_address);
        mapView = findViewById(R.id.mapView);

        pickUp = findViewById(R.id.prepare_order_address_pick_up);
        dropOff = findViewById(R.id.prepare_order_address_drop_off);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NotNull MapfitMap mapfitMap) {
                LatLng position = new LatLng(40.729913, -74.000664);
                mapfitMap.addMarker(new MarkerOptions()
                        .position(position)
                        .icon(MapfitMarker.ARTS));
            }
        });

        init();


    }

    private void init() {
        prepareBack = findViewById(R.id.prepare_order_back);
        prepareNext = findViewById(R.id.prepare_order_next);

        prepareBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        prepareNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PrepareOrderTimeNoteActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    private void requestPermission(){
        if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            mapfitMap.getMapOptions().setUserLocationEnabled(true);

        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    LOCATION_PERMISSION_REQUEST_CODE);
        }
    }

    @SuppressLint("MissingPermission")
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (permissions.length == 1 &&
                    permissions[0] == Manifest.permission.ACCESS_FINE_LOCATION &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                // permission is granted
                mapfitMap.getMapOptions().setUserLocationEnabled(true, LocationPriority.HIGH_ACCURACY);


            } else {

            }
        }
    }
}
