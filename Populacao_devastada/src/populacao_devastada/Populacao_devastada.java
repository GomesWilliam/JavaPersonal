
package populacao_devastada;


public class Populacao_devastada {


    public static void main(String[] args) {
        
        double eurasia= 1000, estasia=5000, oceania=10000;
      int i=1;
      
      
        System.out.printf("Ano           Eurasia          estasia             oceania\n 0            %.2f          %.2f             %.2f\n", eurasia, estasia, oceania);
       
      
        
        while(i<=1000){
          eurasia = eurasia + eurasia*0.02;
          estasia = estasia + estasia*0.01;
          oceania = oceania + oceania*0.005;
          
          if(i%100==0){
              eurasia = eurasia/2;
              estasia = estasia/2;
              oceania = oceania/2;
          }
          
          if(i%10==0){
            
            System.out.printf("Ano           Eurasia          estasia             oceania\n %d            %.2f          %.2f             %.2f\n",i, eurasia, estasia, oceania);  
            //System.out.printf("Ano         Eurasia         estasia         oceania\n");
            //System.out.printf(" %d          %.2f        %.2f          %.2f\n\n", i, eurasia, estasia, oceania);  
          }
          
          
          i++;
          
          
      }
    }
    
}
