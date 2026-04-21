package com.ulp.trabajopractico3;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.ulp.trabajopractico3.databinding.ActivityDetalleBinding;
import java.util.List;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Libro l = (Libro) getIntent().getSerializableExtra("libro");

        if (l != null) {
            binding.tvTituloDetalle.setText(l.getTitulo());
            binding.tvAutorDetalle.setText(l.getAutor());
            binding.tvPaginasDetalle.setText(l.getPaginas() + " páginas");
            binding.tvAnioDetalle.setText(String.valueOf(l.getAnioPublicacion()));
            binding.tvDescripcionDetalle.setText(l.getDescripcion());

            Glide.with(this)
                    .load(l.getUrlPortada())
                    .centerCrop()
                    .placeholder(R.drawable.placeholder_cover)
                    .into(binding.ivPortadaDetalle);

            List<String> generos = l.getGeneros();
            if (generos != null) {
                for (String genero : generos) {
                    Chip chip = new Chip(this);
                    chip.setText(genero);
                    chip.setChipBackgroundColor(ColorStateList.valueOf(Color.parseColor("#E8F5E9")));
                    chip.setTextColor(Color.parseColor("#2E7D32"));
                    chip.setChipStrokeColor(ColorStateList.valueOf(Color.parseColor("#C8E6C9")));
                    chip.setChipStrokeWidth(1);
                    chip.setTextSize(12);
                    binding.cgGeneros.addView(chip);
                }
            }
        }

        binding.btnVolverDetalle.setOnClickListener(v -> onBackPressed());
    }
}