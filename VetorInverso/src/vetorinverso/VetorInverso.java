
package vetorinverso;

import java.util.Scanner;

public class VetorInverso {

    public static void main(String[] args) {
        int a[]= new int[20];
        int b[]= new int[20];
        int n;
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<20; i++){
            System.out.println("Digite um número inteiro, posicão do vetor: "+i);
            n = ler.nextInt();
            a[i]=n;
        
        }
        
        for(int i=0; i<20; i++){
            b[19 - i]= a[i];
        }
        
        
        
        System.out.println("\n");
        for(int i=0; i<20; i++){
            System.out.printf("%d  ", a[i]);
        
        } 
         System.out.println("\n");
        for(int i=0; i<20; i++){
            System.out.printf("%d  ", b[i]);
        }
        System.out.println("\n");
        
    }
    
}
