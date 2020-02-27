package edades;

public class EdadesAlgoritmosObjetos {

    public float PromedioEdadMujeres(int SumaEdadMuj, int CantMuj) {

        return (float) (SumaEdadMuj / CantMuj);

    }

    public float PorcentajeMujeres(int CantMujeres, int CantPersonas) {

        // el (float) es para garantizar que el cálculo sea de este tipo y muestre los decimales
        return (float) ((CantMujeres/ CantPersonas));
    }
}
