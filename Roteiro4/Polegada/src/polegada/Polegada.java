
package polegada;

import java.util.Scanner;


public class Polegada {


    public static void main(String[] args) {
        double  pl;
        
        Scanner pol = new Scanner(System.in);
    
        for(double cent = 1; cent <=20; cent++){
            pl = cent*2.54;
            System.out.printf("%.2f centímetros é %.2f\n", cent, pl);
        }
        
    }
    
}
