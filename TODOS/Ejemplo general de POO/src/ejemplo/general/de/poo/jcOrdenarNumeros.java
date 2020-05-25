
package ejemplo.general.de.poo;


public class jcOrdenarNumeros {

    private int N1;
    private int N2;
    private int N3;

    /**
     * @return the N1
     */
    public int getN1() {
        return N1;
    }

    /**
     * @param N1 the N1 to set
     */
    public void setN1(int N1) {
        this.N1 = N1;
    }

    /**
     * @return the N2
     */
    public int getN2() {
        return N2;
    }

    /**
     * @param N2 the N2 to set
     */
    public void setN2(int N2) {
        this.N2 = N2;
    }

    /**
     * @return the N3
     */
    public int getN3() {
        return N3;
    }

    /**
     * @param N3 the N3 to set
     */
    public void setN3(int N3) {
        this.N3 = N3;
    }
    
   public jcOrdenarNumeros()
   {
       this.N1 = 0;
       this.N2 = 0;       
       this.N3 = 0;
   }
    
    
   public String OrdenarNumeros (int N1, int N2, int N3)
   {
       String NumerosOrdenados ="";
       if (N1>N2 && N1>N3)
       {
           if (N2>N3)
           {
               NumerosOrdenados = N1 +", "+N2+", "+ N3;
           }
           else
           {
               NumerosOrdenados = N1 +", "+N3+", "+ N2;
           }
       }
       else
       {
           if (N2>N3)
           {
               if (N1>N3)
               {
                    NumerosOrdenados = N2 +", "+N1+", "+ N3;
               }
               else
               {
                    NumerosOrdenados = N2 +", "+N3+", "+ N1;
               }
           }
           else
           {
               if (N1>N2)
               {
                    NumerosOrdenados = N3 +", "+N1+", "+ N2;
               }
               else
               {
                    NumerosOrdenados = N3 +", "+N2+", "+ N1;
               }
           }
       
       
       }
   
       return NumerosOrdenados;
   }
   
}
