package com.example.imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.imagenes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btSalir.setOnClickListener(v -> {
            finish();
        });

        binding.ivImagen1.setOnClickListener(v -> navigateToImagenActivity(R.drawable.c_logo, binding.ivImagen1.getContentDescription().toString()));

        binding.ivImagen2.setOnClickListener(v -> navigateToImagenActivity(R.drawable.go_logo, binding.ivImagen2.getContentDescription().toString()));

        binding.ivImagen3.setOnClickListener(v -> navigateToImagenActivity(R.drawable.android_logo, binding.ivImagen3.getContentDescription().toString()));

        binding.ivImagen4.setOnClickListener(v -> navigateToImagenActivity(R.drawable.flutter_logo, binding.ivImagen4.getContentDescription().toString()));
    }

    private void navigateToImagenActivity (int imagen_id, String imagen_title) {
        Intent intent = new Intent(this, ImagenActivity.class);
        intent.putExtra("imagen_id", imagen_id);
        intent.putExtra("imagen_title", imagen_title);
        startActivity(intent);
    }
}