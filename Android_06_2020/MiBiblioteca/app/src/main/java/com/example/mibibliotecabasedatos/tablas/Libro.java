package com.example.mibibliotecabasedatos.tablas;

public class Libro {

    public final static String NOMBRE_TABLA="TLIBRO";
    public final static String COLUMNA_ID="ID";
    public final static String COLUMNA_TITULO="TITULO";
    public final static String COLUMNA_AUTOR="AUTOR";
    public final static String COLUMNA_FEPUBLICACION="FEPUBLICACION";
    public final static String COLUMNA_ESTADO="ESTADO";

    public final static String CREATE_TABLE="create table "
            + NOMBRE_TABLA + "(" + COLUMNA_ID
            + " integer primary key autoincrement, "
            + COLUMNA_TITULO +" text not null, "
            + COLUMNA_AUTOR +" text not null, "
            + COLUMNA_FEPUBLICACION +" text not null, "
            + COLUMNA_ESTADO +" text not null "+");";

    // variables miembro o variables que son propias de la clase (encapsulamiento)

    private String id;
    private String titulo;
    private String autor;
    private String fepublicacion;
    private boolean estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFepublicacion() {
        return fepublicacion;
    }

    public void setFepublicacion(String fepublicacion) {
        this.fepublicacion = fepublicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    // Modificadores de acceso o propiedades que son publicas y permite llevar información a variables miembros que son privadas


}
