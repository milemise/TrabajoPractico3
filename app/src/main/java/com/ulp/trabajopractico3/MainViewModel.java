package com.ulp.trabajopractico3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Libro> mLibro = new MutableLiveData<>();
    private List<Libro> lista = new ArrayList<>();

    public MainViewModel() {
        lista.add(new Libro("El Hobbit", "J.R.R Tolkien", 300, "Una aventura épica en la Tierra Media."));
        lista.add(new Libro("1984", "George Orwell", 328, "Una novela sobre el control total."));
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