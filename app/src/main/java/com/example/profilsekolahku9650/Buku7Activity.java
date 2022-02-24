package com.example.profilsekolahku9650;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mtk7(View view) {
        goTourl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    public void bin7(View view) {
        goTourl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }

    public void bing7(View view) {
        goTourl("https://drive.google.com/file/d/17ohLAJooXRxPksCppQPFyVcmzS0v64xS/view?usp=drivesdk");
    }

    private void goTourl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent LaunchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LaunchBrowser);
    }
}