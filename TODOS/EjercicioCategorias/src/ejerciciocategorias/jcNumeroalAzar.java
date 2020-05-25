package ejerciciocategorias;


public class jcNumeroalAzar {
    
    public double TotalPagarNeto(int TotalPagarBruto, double Descuento)
    {
        double CalcularValorPagar = 0;
        
        CalcularValorPagar = TotalPagarBruto - Descuento;
    
        return CalcularValorPagar;
    }
    
    
}
