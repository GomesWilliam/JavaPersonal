
package aula8ex1prof;

import java.util.Scanner;


public class Aula8Ex1Prof {

    public static int[] InsereDados(int n){
        int vetor[] = new int[n];
        int valor;
        Scanner ler = new Scanner(System.in);        
        for(int i = 0; i<n; i++){
            System.out.println("Digite um valor para o vetor: índice "+i);
            valor = ler.nextInt();
            vetor[i] = valor;
        }
        return vetor;
    }
    
    public static int[][] Coluna1(int vetorA[], int vetorB[], int result[][]){      
        for(int i = 0; i<result.length; i++){
          result[i][0] = vetorA[i]+vetorB[i];
            
        }
        return result;
    }
    
    
    public static int[][] Coluna2(int vetorB[], int result[][]){     
        for(int i = 0; i<result.length; i++){
          result[i][1] = vetorB[i]*5;
            
        }
        return result;
    }
     
    public static int[][] Coluna3(int vetorB[], int result[][]){     
        for(int i = 0; i<12; i++){
          result[i][2] = vetorB[11-i];
            
        }
        return result;
    }
    
    public static int[][] Coluna4(int vetorB[], int result[][]){     
        for(int i = 0; i<12; i++){
                     
        }
        return result;
    }
    
    public static void main(String[] args) {
       int[] A = InsereDados(12);
       int[] B = InsereDados(12);
       
       int[][] matC = new int[12][3];
       
       matC = Coluna1(A, B, matC);
       matC = Coluna2(B, matC);
       matC = Coluna3(A, matC);
       
       for(int i=0; i<12; i++){
           for(int j=0; j<3;j++){
               System.out.printf("%d                     ",matC[i][j]);
           }
           System.out.println(" ");
        }
    }
    
    
    
    
    
}
