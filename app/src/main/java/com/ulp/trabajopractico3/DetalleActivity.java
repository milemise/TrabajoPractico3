package com.ulp.trabajopractico3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.ulp.trabajopractico3.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Libro l = (Libro) getIntent().getSerializableExtra("libro");

        if (l != null) {
            binding.tvTitulo.setText(l.getTitulo());
            binding.tvAutor.setText("Autor: " + l.getAutor());
            binding.tvPaginas.setText("Páginas: " + l.getPaginas());
            binding.tvDescripcion.setText(l.getDescripcion());
        }
    }
}