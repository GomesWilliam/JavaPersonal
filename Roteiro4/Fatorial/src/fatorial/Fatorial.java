
package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        double n, acm=1; 
        
        Scanner ft = new Scanner(System.in);
        
        System.out.println("Digite um número");
        n =ft.nextDouble();
        
        if(n==0){
            acm=1;
        }
        else{
            while(n>1){
                acm = acm*n;
                n--;
            
            }
        }
        
        System.out.println("O resultado é: "+ acm);
        
    }
    
}
