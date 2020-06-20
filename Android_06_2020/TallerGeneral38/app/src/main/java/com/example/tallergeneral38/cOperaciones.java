package com.example.tallergeneral38;

public class cOperaciones {

    public float Raiz(float numero)
    {
        float inicial=0;
        float[] raices= new float[10];
        float raiz=0;
        int contador=0;
        float diferencia=1;

        inicial=numero/2;
        raiz= (inicial/2)+(numero/(2*inicial));
        raices[contador]=raiz;

        while(diferencia>0.00001){

        raiz= (raiz/2)+(numero/(2*raiz));
        contador=contador+1;
        raices[contador]=raiz;
        diferencia= Math.abs(raices[contador]-raices[contador-1]);
        }

        return raiz;

    }

}
