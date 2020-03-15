
package frutas;


public class clstotalPagar {
    
    public double total (int cantidad,int precio){
            
        if (cantidad<=2){
            
            return (double) cantidad*precio;
        } 
        else {
            
            if (cantidad<=5){
                
              return (double) cantidad*precio*0.9;  
            }
            else{
                if(cantidad<=10){
                   return (double) cantidad*precio*0.85; 
                }
                else{
                   return (double) cantidad*precio*0.82; 
                }
            }
        }
        
        
        
            
    }
    
}
