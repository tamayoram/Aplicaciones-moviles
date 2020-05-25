
package herencia;

public class Profesor extends Persona{
    
   //Las varibales miembro de la clase son:
    private String Especialidad;

    
    //Las siguientes son las propiedades asociadas a las variables miembro
    
    /**
     * @return the Especialidad
     */
    public String getEspecialidad() {
        return Especialidad;
    }

    /**
     * @param Especialidad the Especialidad to set
     */
    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}
