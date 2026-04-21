package com.ulp.trabajopractico3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Libro> mLibro = new MutableLiveData<>();
    private List<Libro> lista = new ArrayList<>();

    public MainViewModel() {
        lista.add(new Libro("El Hobbit", "J.R.R Tolkien", 300, 1937,
                Arrays.asList("Fantasía", "Aventura"),
                "Bilbo Bolsón se lanza a una aventura con Gandalf y enanos para recuperar un tesoro.",
                "https://imagessl6.casadellibro.com/a/l/t0/46/9788445001646.jpg"));

        lista.add(new Libro("Crimen y Castigo", "Fiodor Dostoyevski", 672, 1866,
                Arrays.asList("Psicológico", "Drama"),
                "Raskólnikov comete un asesinato y enfrenta un profundo tormento moral.",
                "https://imagessl8.casadellibro.com/a/l/t0/38/9788437614038.jpg"));

        lista.add(new Libro("Orgullo y Prejuicio", "Jane Austen", 432, 1813,
                Arrays.asList("Romance", "Drama Social"),
                "La relación entre Elizabeth Bennet y Fitzwilliam Darcy en la Inglaterra del siglo XIX.",
                "https://mestasediciones.com/wp-content/uploads/2020/06/C60-Orgullo-y-prejuicio.jpg"));

        lista.add(new Libro("1984", "George Orwell", 328, 1949,
                Arrays.asList("Distopía", "Política"),
                "Winston Smith intenta rebelarse contra el control total del Gran Hermano.",
                "https://www.bookerworm.com/images/1984.jpg"));
    }

    public LiveData<Libro> getMLibro() {
        return mLibro;
    }

    public void buscar(String titulo) {
        for (Libro l : lista) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                mLibro.setValue(l);
                return;
            }
        }
        mLibro.setValue(null);
    }
}