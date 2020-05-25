
package herencia;

public class Estudiante extends Persona{
    
    //Las varibales miembro de la clase son:
    
    private int NumeroMatricula;
    private int NombreUniversidad;

    //Las siguientes son las propiedades asociadas a las variables miembro
    
    /**
     * @return the NumeroMatricula
     */
    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    /**
     * @param NumeroMatricula the NumeroMatricula to set
     */
    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    /**
     * @return the NombreUniversidad
     */
    public int getNombreUniversidad() {
        return NombreUniversidad;
    }

    /**
     * @param NombreUniversidad the NombreUniversidad to set
     */
    public void setNombreUniversidad(int NombreUniversidad) {
        this.NombreUniversidad = NombreUniversidad;
    }
    
    
    
}
