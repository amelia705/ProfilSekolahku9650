package com.example.profilsekolahku9650;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.header1,
            R.drawable.header2,
            R.drawable.header1,
            R.drawable.header2,
            R.drawable.header3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void musik(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.EkskulActivity.this, MusikActivity.class);
        startActivity(intent);
    }

    public void lari(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.EkskulActivity.this, LariActivity.class);
        startActivity(intent);
    }

    public void bulutangkis(View view) {
        Intent intent = new Intent(com.example.profilsekolahku9650.EkskulActivity.this, BulutangkisActivity.class);
        startActivity(intent);
    }
}