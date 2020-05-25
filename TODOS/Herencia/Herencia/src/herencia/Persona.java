
package herencia;

public class Persona {

    //Variables miembro o variables
    private int     Identificacion;
    private String  Nombre1;
    private String  Nombre2;
    private String  Apellido1;
    private String  Apellido2;
    
    
    //A continuación vamos a crear las propiedades por medio de las cuales se puede tener acceso a las variables miembro.
    //Modificadores de Acceso
    //

    /**
     * @return the Identificacion
     */
    public int getIdentificacion() {
        return Identificacion;
    }

    /**
     * @param Identificacion the Identificacion to set
     */
    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    /**
     * @return the Nombre1
     */
    public String getNombre1() {
        return Nombre1;
    }

    /**
     * @param Nombre1 the Nombre1 to set
     */
    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    /**
     * @return the Nombre2
     */
    public String getNombre2() {
        return Nombre2;
    }

    /**
     * @param Nombre2 the Nombre2 to set
     */
    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    /**
     * @return the Apellido1
     */
    public String getApellido1() {
        return Apellido1;
    }

    /**
     * @param Apellido1 the Apellido1 to set
     */
    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    /**
     * @return the Apellido2
     */
    public String getApellido2() {
        return Apellido2;
    }

    /**
     * @param Apellido2 the Apellido2 to set
     */
    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }
    
    //A continuación vamos a crear un constructor simple
    public Persona()
    {
        this.Identificacion=0;
        this.Nombre1="";
        this.Nombre2="";
        this.Apellido1="";
        this.Apellido2="";
    }
    
    //Vamos a crear otro constructor y así estamos indicando que es un constructor SOBRECARGADO
    public Persona(int Identificacion, String Nombre1, String Nombre2, String Apellido1, String Apellido2)
    {
        this.Identificacion=Identificacion;
        this.Nombre1=Nombre1;
        this.Nombre2=Nombre2;
        this.Apellido1=Apellido1;
        this.Apellido2=Apellido2;
    }    
    
    //Ahora le vamos a crear a esta clase los métodos tipo procedimiento (void) y los métodos tipo Función (TipoDeDato)
    //Vamos a crear métodos tipo procedimiento, esto no devuelven resultados en su nombre
    public void Sumar()
    {
        int Suma = 0;
        Suma = Suma;
    }
    // Vamos a crear este método sobrecargado
    public void Sumar(int N1)
    {
        int Suma = 0;
        Suma = N1 + N1;
    }    
    //
    //Ahora vamnos a crear métodos tipo Función, la definición de una función, es una estructura que permite ejecutar un algoritmo y
    //devolver un único valor.
    
    public int Multiplicar()
    {
        int Multiplica = 1;
        Multiplica = Multiplica;
        
        return Multiplica;
    }
    //Ahora creeamos una función sobrecargada
    public int Multiplicar(int N1, int N2)
    {
        int Multiplica = 1;
        Multiplica = Multiplica;
        
        return N1 * N2;
    }    
    
    
}
