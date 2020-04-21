package com.example.notasejercicio20;

public class ClaseOperaciones {

    public double CacularNotaDefinitiva(double Nota1, double Nota2, double Nota3)
    {
        return (Nota1 * 0.1 + Nota2 * 0.5 + Nota3 * 0.4);
    }

    public double CacularNotaDefinitiva(double Nota1, double Nota2, double Nota3, double por10,
                                        double por40, double por50)
    {
        return (Nota1 * por10 + Nota2 * por50 + Nota3 * por40);
    }

}
