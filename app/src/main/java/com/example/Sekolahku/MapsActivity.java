package com.example.Sekolahku;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng mtd = new LatLng(-6.423366380775939, 106.79650631221752);
        mMap.addMarker(new MarkerOptions().position(mtd).title("SMKS Al-Muhtadin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mtd));

        LatLng assalamah = new LatLng(-6.42920390562395, 106.80379669724338);
        mMap.addMarker(new MarkerOptions().position(assalamah).title("SMKS Assalamah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(assalamah));

        LatLng bakti = new LatLng(-6.403086940580218, 106.7572150972432);
        mMap.addMarker(new MarkerOptions().position(bakti).title("SMKS Bhakti Karya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bakti));

        LatLng kusuma = new LatLng(-6.377103140099228, 106.80821836655791);
        mMap.addMarker(new MarkerOptions().position(kusuma).title("SMKS Kusuma Bangsa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kusuma));

        LatLng smk1 = new LatLng(-6.43961825593067, 106.88347926900916);
        mMap.addMarker(new MarkerOptions().position(smk1).title("SMK Negeri 1 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk1));

        LatLng smk2 = new LatLng(-6.401407632659895, 106.75875041318719);
        mMap.addMarker(new MarkerOptions().position(smk2).title("SMK Negeri 2 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk2));

        LatLng smk4 = new LatLng(-6.395998181975931, 106.89487718435137);
        mMap.addMarker(new MarkerOptions().position(smk4).title("SMK Negeri 4 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk4));

        LatLng perintis = new LatLng(-6.399854693918934, 106.8251221592149);
        mMap.addMarker(new MarkerOptions().position(perintis).title("SMKS Perintis 1 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perintis));

        LatLng seting = new LatLng(-6.398246303241991, 106.80991153832362);
        mMap.addMarker(new MarkerOptions().position(seting).title("SMKS Setia Negara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(seting));

        LatLng harapan = new LatLng(-6.379157973661802, 106.81525072298092);
        mMap.addMarker(new MarkerOptions().position(harapan).title("SMKS Farmasi Harpan Massa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(harapan));
    }
}
