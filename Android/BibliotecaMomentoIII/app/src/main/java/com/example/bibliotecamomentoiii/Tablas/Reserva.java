package com.example.bibliotecamomentoiii.Tablas;

public class Reserva {
    public final static String NOMBRE_TABLA = "TRESERVA";
    public final static String COLUMNA_ID = "ID";
    public final static String COLUMNA_AFILIADO = "AFILIADO";
    public final static String COLUMNA_LIBRO = "LIBRO";
    public final static String COLUMNA_FEENTREGA = "FEENTREGA";


    public static final String CREATE_TABLE = "create table "
            + NOMBRE_TABLA + "(" + COLUMNA_ID
            + " integer primary key autoincrement, "
            + COLUMNA_AFILIADO + " text not null, "
            + COLUMNA_LIBRO + " text not null, "
            + COLUMNA_FEENTREGA + " text not null, "
            + " FOREIGN KEY ("+COLUMNA_AFILIADO+") REFERENCES "
            + Afiliado.NOMBRE_TABLA + " ("+ Afiliado.COLUMNA_ID+"),"
            + " FOREIGN KEY ("+COLUMNA_LIBRO+") REFERENCES "+
            Libro.NOMBRE_TABLA + " ("+ Libro.COLUMNA_ID+")" + ");";


    private  String id;
    private String afiliado;
    private String libro;
    private String feentrega;

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
