
package ropa;


public class clsPagar {
    
   public double total (int cantidad,int precio,String pago){
         
      double valor=cantidad*precio;
       
        if (valor<=100000){
            
            if(pago=="Efectivo"){
                
            return (double) valor*0.8;
            } 
            
            else {
                                        
                return (double) valor*0.9;  
                          
            }
            
        }
            else {
            
            if (valor<=200000){
            
            if(pago=="Efectivo"){
                
            return (double) valor*0.7;
            } 
            
            else {
                                        
                return (double) valor*0.85;  
                }
            
            }
            
              
        
        else{
                
         if(pago=="Efectivo"){
             
            return (double) valor*0.6;
            } 
            else {
                                           
                return (double) valor*0.8;  
                            
            }
                          
                }  
       
        
   }
        
   }
   
   
   }

