package com.example.mibibliotecabasedatos.tablas;

public class Reserva {

    public final static string NOMBRE_TABLA="TRESERVA";
    public final static string COLUMNA_ID="ID";
    public final static string COLUMNA_AFILIADO="AFILIADO";
    public final static string COLUMNA_LIBRO="LIBRO";
    public final static string COLUMNA_FEENTREGA="FEENTREGA";

    public final static string CREATE_TABLE="create table "+ NOMBRE_TABLA + "(" + COLUMNA_ID+ " integer primary key autoincrement, "
            +COLUMNA_AFILIADO+" text not null, "+COLUMNA_LIBRO+" text not null, "+COLUMNA_FEENTREGA+" text not null, "+"FOREIGN KEY ("+COLUMNA_AFILIADO+") REFERENCES "+Afiliado.NOMBRE_TABLA+"("+Afiliado.COLUMNA_ID+"),"
            +"FOREIGN KEY ("+COLUMNA_LIBRO+") REFERENCES "+Libro.NOMBRE_TABLA+"("+Libro.COLUMNA_ID+");";

    // variables miembro o variables que son propias de la clase (encapsulamiento)

    private string id;
    private string afiliado;
    private string libro;
    private string feentrega;

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(string afiliado) {
        this.afiliado = afiliado;
    }

    public string getLibro() {
        return libro;
    }

    public void setLibro(string libro) {
        this.libro = libro;
    }

    public string getFeentrega() {
        return feentrega;
    }

    public void setFeentrega(string feentrega) {
        this.feentrega = feentrega;
    }
}
