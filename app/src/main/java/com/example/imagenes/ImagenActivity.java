package com.example.imagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.os.Bundle;

import com.example.imagenes.databinding.ActivityImagenBinding;

public class ImagenActivity extends AppCompatActivity {

    private ActivityImagenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityImagenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivImagen.setImageDrawable(AppCompatResources.getDrawable(this, getIntent().getIntExtra("imagen_id", R.drawable.c_logo)));
        binding.tvDescripcion.setText(getIntent().getStringExtra("imagen_title"));

        binding.btVolver.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}