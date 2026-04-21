package com.ulp.trabajopractico3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.ulp.trabajopractico3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv = new ViewModelProvider(this).get(MainViewModel.class);

        mv.getMLibro().observe(this, libro -> {
            if (libro != null) {
                Intent intent = new Intent(this, DetalleActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            } else {
                Toast.makeText(this, "No se encontró el libro", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnBuscar.setOnClickListener(v -> {
            mv.buscar(binding.etBuscador.getText().toString());
        });
    }
}