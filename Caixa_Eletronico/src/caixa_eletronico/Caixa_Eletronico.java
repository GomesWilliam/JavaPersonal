
package caixa_eletronico;

import java.util.Scanner;


public class Caixa_Eletronico {

    
    public static void main(String[] args) {
       int contA=0, contB=0, contC=0, contD=0, contE=0, valor;
       
       Scanner bc = new Scanner(System.in);
       
        System.out.println("Digite o valor a retirar");
        valor = bc.nextInt();
        
        if(valor>=2){
            while(valor >=50){
                valor = valor - 50;
                contA++;
            }
            
            while(valor  >= 20 ) {
                valor = valor - 20;
                contB++;
                            
            }
            while(valor >= 10){
                valor = valor - 10;
                contC++;                
            }
            while(valor  >= 5){
                valor = valor - 5;
                contD++;
            }
            while(valor  >= 2){
                valor = valor - 2;
                contE++;
            }
        
            System.out.printf("Notas de 50: %d\nNotas de 20: %d\nNotas de 10: %d\nNotas de 5: %d\nNotas de 2: %d\n", contA, contB, contC, contD, contE);   
          
        }
       
       
       
        
    }
    
}
