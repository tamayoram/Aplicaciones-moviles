package com.example.tallergeneral20;

public class cOperaciones {

    public int Residuo(int numerador,int denominador)
    {

        while(numerador!=(numerador%denominador)){

            numerador=numerador-denominador;


        }

        return numerador;

    }


    public int Cociente(int numerador,int denominador)
    {
        int cociente=0;
        while(numerador!=(numerador%denominador)){

            numerador=numerador-denominador;
            cociente=cociente +1;

        }

        return cociente;
    }




}
