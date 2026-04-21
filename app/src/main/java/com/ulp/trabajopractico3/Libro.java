package com.ulp.trabajopractico3;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private int paginas;
    private int anioPublicacion;
    private List<String> generos;
    private String descripcion;

    public Libro(String titulo, String autor, int paginas, int anioPublicacion, List<String> generos, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anioPublicacion = anioPublicacion;
        this.generos = generos;
        this.descripcion = descripcion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public List<String> getGeneros() { return generos; }
    public String getDescripcion() { return descripcion; }
}