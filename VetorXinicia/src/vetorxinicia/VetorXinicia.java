
package vetorxinicia;


public class VetorXinicia {

    public static void main(String[] args) {
      double vector[]= new double[10];
      double y[] = new double[10];
      vector[0]= 10; vector[1]= 5; vector[2]= 4; vector[3]= 8; vector[4]= 3; vector[5]= 5;
      vector[6]= 2; vector[7]= 1; vector[9]= 9; vector[9]= -1000;
      
      for(int i=0; i<10; i++){
            if(vector[i] < 0){
                y[i] = vector[i]/(-2); 
            }
            else if(vector[i]%2 ==0){
                y[i]= vector[i]*4;
            }
            else{
                y[i]= vector[i]*10;
            }
      }
      
      for(int cont=0; cont<10; cont++){
          System.out.printf("%.0f       ", vector[cont]);
      }
        System.out.println("");
      for(int cont=0; cont<10; cont++){
          System.out.printf("%.0f       ", y[cont]);
      }
        System.out.println("");
      
      
    }
    
}
