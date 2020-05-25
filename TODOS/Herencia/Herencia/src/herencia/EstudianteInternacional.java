package herencia;

public class EstudianteInternacional extends Estudiante {
    
    //Las varibales miembro de la clase son:
    private String PaisAlQuePertenece;

    //Las siguientes son las propiedades asociadas a las variables miembro
    /**
     * @return the PaisAlQuePertenece
     */
    public String getPaisAlQuePertenece() {
        return PaisAlQuePertenece;
    }

    /**
     * @param PaisAlQuePertenece the PaisAlQuePertenece to set
     */
    public void setPaisAlQuePertenece(String PaisAlQuePertenece) {
        this.PaisAlQuePertenece = PaisAlQuePertenece;
    }
    
    
}
