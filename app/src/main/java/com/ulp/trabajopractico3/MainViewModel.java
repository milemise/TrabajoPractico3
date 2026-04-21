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
                "El Hobbit, o ida y vuelta es una novela de fantasía para niños del autor inglés J. R. R. Tolkien. Fue publicado en 1937 con gran éxito de crítica, siendo nominado a la Medalla Carnegie y galardonado con un premio del New York Herald Tribune a la mejor ficción juvenil."));

        lista.add(new Libro("Crimen y Castigo", "Fedor Dostoyevski", 672, 1866,
                Arrays.asList("Psicológico", "Drama", "Filosófico"),
                "Crimen y castigo es una novela del escritor ruso Fiódor Dostoyevski. Sigue al estudiante Rodión Raskólnikov, quien planea un asesinato para probar su teoría sobre la superioridad moral de ciertos individuos y enfrenta las consecuencias psicológicas de su acto."));

        lista.add(new Libro("Orgullo y Prejuicio", "Jane Austen", 432, 1813,
                Arrays.asList("Romance", "Sátira", "Drama Social"),
                "La historia de las hermanas Bennet y su búsqueda de amor y posición social en la Inglaterra rural. El enfoque central está en Elizabeth Bennet y su relación con el adinerado y orgulloso Fitzwilliam Darcy, explorando temas de prejuicio y malentendidos."));
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