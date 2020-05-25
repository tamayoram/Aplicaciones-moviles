
package ejemplo.general.de.poo;

//Creamos la clase bajo el IDENTIFICADOR con nombre jcConstructoresEquiposDeFutbol
public class jcConstructoresEquiposDeFutbol {
    ////////////////////////////////////////////////////////////////////////
    //Vamos a crear las VARIABLES MIEMBRO o propias de la clase o atributos.
    ////////////////////////////////////////////////////////////////////////
    private String NombreDelEquipo = "";
    private String CiudadDelEquipo = "";
    private int CantidadDeJugadores = 0;
    private int Puntos =0;

    ////////////////////////////////////////////////////////////////////////
    //Una vez creadas las variables miembro, por medio de ellas podemos generar las PROPIEDADES, las
    //cuales van a permitir asignarle un valor a las varibales miembro.
    ////////////////////////////////////////////////////////////////////////
    //
    /**
     * @return the NombreDelEquipo
     */
    public String getNombreDelEquipo() {
        return NombreDelEquipo;
    }

    /**
     * @param NombreDelEquipo the NombreDelEquipo to set
     */
    public void setNombreDelEquipo(String NombreDelEquipo) {
        this.NombreDelEquipo = NombreDelEquipo;
    }

    /**
     * @return the CiudadDelEquipo
     */
    public String getCiudadDelEquipo() {
        return CiudadDelEquipo;
    }

    /**
     * @param CiudadDelEquipo the CiudadDelEquipo to set
     */
    public void setCiudadDelEquipo(String CiudadDelEquipo) {
        this.CiudadDelEquipo = CiudadDelEquipo;
    }

    /**
     * @return the CantidadDeJugadores
     */
    public int getCantidadDeJugadores() {
        return CantidadDeJugadores;
    }

    /**
     * @param CantidadDeJugadores the CantidadDeJugadores to set
     */
    public void setCantidadDeJugadores(int CantidadDeJugadores) {
        this.CantidadDeJugadores = CantidadDeJugadores;
    }

    /**
     * @return the Puntos
     */
    public int getPuntos() {
        return Puntos;
    }

    /**
     * @param Puntos the Puntos to set
     */
    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }
    
    
    //Las siguientes estrcutruas son CONSTRUCTORES
    public jcConstructoresEquiposDeFutbol()
    {
    
    }

    public jcConstructoresEquiposDeFutbol(String NombreDelEquipo)
    {
        this.NombreDelEquipo = NombreDelEquipo;
    }    
    
    public jcConstructoresEquiposDeFutbol(String NombreDelEquipo, String CiudadDelEquipo, int CantidadDeJugadores,
            int Puntos)
    {
        this.NombreDelEquipo = NombreDelEquipo;
        this.CiudadDelEquipo = CiudadDelEquipo;
        this.CantidadDeJugadores = CantidadDeJugadores;
        this.Puntos = Puntos;
    }
    
    
    //A continuación vamos a crear FUNCIONES, las funciones devuelven un resultado
    //Sumar es un IDENTIFICADOR, N1 y N2 son VARIABLES locales
    public int Sumar(int N1, int N2)
    {
           return N1 + N2; 
    }
    
    //A continuación vamos a crear PROCEDIMIENTOS, no devuelvn resultados
    public void Multiplicacion (int N1, int N2)
    {
        int Multiplica = 0;
        Multiplica = N1 * N2; 
    
        this.Puntos = Multiplica;
    }
    
    //Sobrecarga de métodos
    public double Sumar(double N1, int N2)
    {
           return N1 + N2; 
    }    

    public double Sumar(double N1, double N2)
    {
           return N1 + N2; 
    }        

    public double Sumar(int N1, double N2)
    {
           return N1 + N2; 
    }
    
    public void Multiplicacion (int N1, int N2, int N3)
    {
        int Multiplica = 0;
        Multiplica = N1 * N2 * N3; 
    
        this.Puntos = Multiplica;
    }    
    
    
}
