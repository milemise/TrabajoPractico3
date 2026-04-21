package com.ulp.trabajopractico3;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private int paginas;
    private String descripcion;

    public Libro(String titulo, String autor, int paginas, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.descripcion = descripcion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public String getDescripcion() { return descripcion; }
}