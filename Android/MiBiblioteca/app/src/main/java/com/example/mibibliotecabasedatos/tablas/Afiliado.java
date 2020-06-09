package com.example.mibibliotecabasedatos.tablas;

public class Afiliado {

    // static implica que el contenido que se defina es fijo
    public final static string NOMBRE_TABLA="TAFILIADO";
    public final static string COLUMNA_ID="ID";
    public final static string COLUMNA_NOMBRE="NOMBRE";
    public final static string COLUMNA_GENERO="GENERO";
    public final static string COLUMNA_ESTADO="ESTADO";
    public final static string COLUMNA_DIRECCION="DIRECCION";
    public final static string COLUMNA_TELEFONO="TELEFONO";
    public final static string COLUMNA_CIUDAD="CIUDAD";

    public final static string CREATE_TABLE="create table "+ NOMBRE_TABLA + "(" + COLUMNA_ID+ " integer primary key autoincrement, "
            +COLUMNA_NOMBRE+" text not null, "+COLUMNA_GENERO+" text not null, "+COLUMNA_ESTADO+" text not null, "+COLUMNA_DIRECCION+
            " text not null, "+COLUMNA_TELEFONO+" text not null, "+COLUMNA_CIUDAD+" text not null"+");";

    // variables miembro o variables que son propias de la clase (encapsulamiento)

    private string id;
    private string nombre;
    private string genero;
    private boolean estado;
    private string direccion;
    private string telefono;
    private string ciudad;

// Modificadores de acceso o propiedades que son publicas y permite llevar información a variables miembros que son privadas

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getGenero() {
        return genero;
    }

    public void setGenero(string genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public string getDireccion() {
        return direccion;
    }

    public void setDireccion(string direccion) {
        this.direccion = direccion;
    }

    public string getTelefono() {
        return telefono;
    }

    public void setTelefono(string telefono) {
        this.telefono = telefono;
    }

    public string getCiudad() {
        return ciudad;
    }

    public void setCiudad(string ciudad) {
        this.ciudad = ciudad;
    }
}
