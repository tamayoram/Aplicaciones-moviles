package herencia;

import java.util.HashSet;
import java.util.Set;

public class Herencia {

    public static void main(String[] args) {

        //Vamos a instanciar las clases (Estructura y Tipos de Datos) y por ende a crear los objetos (DATOS)
        
        //TipoDeDato Persona    VariableTipoObjeto  Instanciar o inicializar    Esta es la clase
        Persona                 oPersona1 =         new                         Persona();

        oPersona1.setIdentificacion(23);
        
        System.out.println(
                String.valueOf(oPersona1.getIdentificacion())
                );
        
        
        System.out.println(oPersona1.Multiplicar(23, 5));
   
        
        EstudianteInternacional oEstudiante1 = new  EstudianteInternacional();
        oEstudiante1.setNombre1("Pepito");
        oPersona1.setApellido2("Pérez");
        
        System.out.println(oEstudiante1.getNombre1() + "," + oPersona1.getApellido2());
        
        
    }
    
}
