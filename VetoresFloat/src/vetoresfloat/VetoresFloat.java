
package vetoresfloat;

import java.util.Scanner;

public class VetoresFloat {

    public static void main(String[] args) {
        float vet[]= new float[50]; 
        float n=0, maior=0, menor=1000000000, soma=0;
        int i=0;
        
        Scanner vetor = new Scanner(System.in);
        
        while(n >= 0 && i < vet.length){ 
           System.out.println("Digite um valor, n negativo para sair");
           n = vetor.nextInt();
           
           if(n >=0 ){
               vet[i]= n;
               soma = soma + vet[i]; 
               i++;       
           }
           if(maior < n){
               maior = n;
           }
           if(menor >= n){
               menor = n;
           }
           
           
         } 
        
  
            
        System.out.println("A media dos valores é "+ (soma/i));
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        
        }
        
    }
