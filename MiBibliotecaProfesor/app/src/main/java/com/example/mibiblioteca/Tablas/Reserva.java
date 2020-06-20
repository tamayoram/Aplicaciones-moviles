package com.example.mibiblioteca.Tablas;

public class Reserva {

    //static, permite definir el contenido de una variable de forma fija.
    //A continuación vamos a definir las variables públicas para cada campo
    //de la tabla TRESERVA
    //
    public final static String NOMBRE_TABLA = "TRESERVA";
    public final static String COLUMNA_ID = "ID";
    public final static String COLUMNA_AFILIADO = "AFILIADO";
    public final static String COLUMNA_LIBRO = "LIBRO";
    public final static String COLUMNA_FEENTREGA = "FEENTREGA";

    //Vamos a crear una variable en la cual llevamos la instrucción SQL
    //para llamarla con una instrución de SQLITE.
    //
    public static final String CREATE_TABLE = "create table "
            + NOMBRE_TABLA + "(" + COLUMNA_ID
            + " integer primary key autoincrement, "
            + COLUMNA_AFILIADO + " text not null, "
            + COLUMNA_LIBRO + " text not null, "
            + COLUMNA_FEENTREGA + " text not null, "
            + " FOREIGN KEY ("+COLUMNA_AFILIADO+") REFERENCES "+ Afiliado.NOMBRE_TABLA + " ("+ Afiliado.COLUMNA_ID+"),"
            + " FOREIGN KEY ("+COLUMNA_LIBRO+") REFERENCES "+ Libro.NOMBRE_TABLA + " ("+ Libro.COLUMNA_ID+")"
            + ");";

    //Vamos a crear las variables MIEMBRO DE LA CLASE
    private  String id;
    private String afiliado;
    private String libro;
    private String feentrega;

    //Vamos a crear los modificadores de ACCESO o PROPIEDADES para poderle llevar un contenido
    //a cada variable miembro de la clase que es privada.
    //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFeentrega() {
        return feentrega;
    }

    public void setFeentrega(String feentrega) {
        this.feentrega = feentrega;
    }

}
