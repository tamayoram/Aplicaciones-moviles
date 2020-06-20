package com.example.myapplication;

public class ClaseOperaciones {

    public double calcularDefinitiva(double nota1, double nota2, double nota3){

        return(nota1*0.1)+(nota2*0.5)+(nota3*0.4);
    }

    public double calcularDefinitiva(double nota1, double nota2, double nota3,double porc1, double porc2, double porc3){

        return(nota1*porc1)+(nota2*porc2)+(nota3*porc3);
    }

}
