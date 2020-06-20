package com.example.mibiblioteca.Tablas;

public class Libro {

    //static, permite definir el contenido de una variable de forma fija.
    //A continuación vamos a definir las variables públicas para cada campo
    //de la tabla TLIBRO
    //
    public final static String NOMBRE_TABLA = "TLIBRO";
    public final static String COLUMNA_ID = "ID";
    public final static String COLUMNA_TITULO = "TITULO";
    public final static String COLUMNA_AUTOR = "AUTOR";
    public final static String COLUMNA_FEPUBLICACION = "FEPUBLICACION";
    public final static String COLUMNA_ESTADO = "ESTADO";


    //Vamos a crear una variable en la cual llevamos la instrucción SQL
    //para llamarla con una instrución de SQLITE.
    //
    public static final String CREATE_TABLE = "create table "
            + NOMBRE_TABLA + "(" + COLUMNA_ID
            + " integer primary key autoincrement, "
            + COLUMNA_TITULO + " text not null, "
            + COLUMNA_AUTOR + " text not null, "
            + COLUMNA_FEPUBLICACION + " text not null, "
            + COLUMNA_ESTADO + " text not null "
            + ");";

    //Vamos a crear las variables MIEMBRO DE LA CLASE
    private  String id;
    private String titulo;
    private String autor;
    private String fepublicacion;
    private boolean estado;

    //Vamos a crear los modificadores de ACCESO o PROPIEDADES para poderle llevar un contenido
    //a cada variable miembro de la clase que es privada.
    //
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
}
