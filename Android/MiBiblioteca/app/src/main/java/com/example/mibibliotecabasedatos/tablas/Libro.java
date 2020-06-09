package com.example.mibibliotecabasedatos.tablas;

public class Libro {

    public final static string NOMBRE_TABLA="TLIBRO";
    public final static string COLUMNA_ID="ID";
    public final static string COLUMNA_TITULO="TITULO";
    public final static string COLUMNA_AUTOR="AUTOR";
    public final static string COLUMNA_FEPUBLICACION="FEPUBLICACION";
    public final static string COLUMNA_ESTADO="ESTADO";

    public final static string CREATE_TABLE="create table "+ NOMBRE_TABLA + "(" + COLUMNA_ID+ " integer primary key autoincrement, "
            +COLUMNA_TITULO+" text not null, "+COLUMNA_AUTOR+" text not null, "+COLUMNA_FEPUBLICACION+" text not null, "+COLUMNA_ESTADO
           +" text not null"+");";

    // variables miembro o variables que son propias de la clase (encapsulamiento)

    private string id;
    private string  titulo;
    private string autor;
    private string fepublicacion;
    private boolean estado;

    // Modificadores de acceso o propiedades que son publicas y permite llevar información a variables miembros que son privadas

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getAutor() {
        return autor;
    }

    public void setAutor(string autor) {
        this.autor = autor;
    }

    public string getFepublicacion() {
        return fepublicacion;
    }

    public void setFepublicacion(string fepublicacion) {
        this.fepublicacion = fepublicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
