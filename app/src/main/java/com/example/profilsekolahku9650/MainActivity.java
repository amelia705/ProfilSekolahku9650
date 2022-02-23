package com.example.profilsekolahku9650;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.profilsekolahku9650.FasilitasActivity;
import com.example.profilsekolahku9650.GaleriActivity;
import com.example.profilsekolahku9650.GuruActivity;
import com.example.profilsekolahku9650.PerpusActivity;
import com.example.profilsekolahku9650.ProfilActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void profil(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }
}

