
package taller1_fabricacompu;



public class jcProcedimientos {
    
    public double ValorBruto(int numeroCompu,int precioCompu){
        
        return (double) numeroCompu*precioCompu;
    }
    
    public double descuento(double valorBruto,int numeroCompu){
        
        if (numeroCompu<5){
            
            return (double) valorBruto*0.1;
        }
        else{
            if(numeroCompu>=5 && numeroCompu<10){
                return(double) valorBruto*0.2;
            }
            else{
                return(double) valorBruto*0.4;
            }
        }
    }
}
