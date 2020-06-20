package com.example.mibiblioteca.Tablas;

public class Afiliado {

    //static, permite definir el contenido de una variable de forma fija.
    //A continuación vamos a definir las variables públicas para cada campo
    //de la tabla TAFILIADO
    //
    public final static String NOMBRE_TABLA = "TAFILIADO";
    public final static String COLUMNA_ID = "ID";
    public final static String COLUMNA_NOMBRE = "NOMBRE";
    public final static String COLUMNA_SEXO = "SEXO";
    public final static String COLUMNA_ESTADO = "ESTADO";
    public final static String COLUMNA_CIUDAD = "CIUDAD";
    public final static String COLUMNA_DIRECCION = "DIRECCION";
    public final static String COLUMNA_TELEFONO = "TELEFONO";

    //Vamos a crear una variable en la cual llevamos la instrucción SQL
    //para llamarla con una instrución de SQLITE.
    //
    public static final String CREATE_TABLE = "create table "
                + NOMBRE_TABLA + "(" + COLUMNA_ID
                + " integer primary key autoincrement, "
                + COLUMNA_NOMBRE + " text not null, "
                + COLUMNA_SEXO + " text not null, "
                + COLUMNA_ESTADO + " text not null, "
                + COLUMNA_CIUDAD + " text not null, "
                + COLUMNA_DIRECCION + " text not null, "
                + COLUMNA_TELEFONO + " text not null"
                + ");";

    //Vamos a crear las variables MIEMBRO DE LA CLASE
    private  String id;
    private String nombre;
    private String sexo;
    private boolean estado;
    private String ciudad;
    private String direccion;
    private String telefono;

    //Vamos a crear los modificadores de ACCESO o PROPIEDADES para poderle llevar un contenido
    //a cada variable miembro de la clase que es privada.
    //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
