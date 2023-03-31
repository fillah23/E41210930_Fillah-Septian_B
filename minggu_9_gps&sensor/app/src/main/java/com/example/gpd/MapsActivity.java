package com.example.gpd;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.gpd.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate layout untuk activity
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment dan get notified saat map sudah siap digunakan
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Cek apakah izin lokasi sudah diberikan atau belum
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true); // Mengaktifkan layer lokasi
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1); // Meminta izin lokasi
        }

        // Menambahkan marker pada titik Jember
        LatLng jember = new LatLng(-8.1827, 113.6681);
        mMap.addMarker(new MarkerOptions().position(jember).title("Jember"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jember, 13)); // Menggerakkan kamera ke titik Jember dengan zoom level 13

        // Menambahkan listener pada map ketika diklik
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                mMap.clear(); // Menghapus marker sebelumnya
                mMap.addMarker(new MarkerOptions().position(latLng).title("Selected Location")); // Menambahkan marker pada titik yang diklik
                mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng)); // Menggerakkan kamera ke titik yang diklik
                String latitude = String.valueOf(latLng.latitude);
                String longitude = String.valueOf(latLng.longitude);
                Toast.makeText(MapsActivity.this, "Latitude: " + latitude + ", Longitude: " + longitude, Toast.LENGTH_SHORT).show(); // Menampilkan toast dengan koordinat yang diklik
            }
        });
    }
}
