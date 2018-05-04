
package aula8ex1;

import java.util.Scanner;

public class Aula8Ex1 {
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
    
    public static double[][] Coluna1(double vetorA[], double vetorB[]){
        double matriz[][] = new double[vetorA.length][3];       
        for(int i = 0; i<vetorA.length; i++){
          matriz[i][0] = vetorA[i]+vetorB[i];
            
        }
        return matriz;
    }
    
    public static double[][] Coluna2(double vetorB[]){
        double matriz[][] = new double[vetorB.length][3];       
        for(int i = 0; i<vetorB.length; i++){
          matriz[i][1] = vetorB[i]*5;
            
        }
        return matriz;
    }
    
    public static double[][] Coluna3(double vetorA[]){
        double matriz[][] = new double[vetorA.length][3];       
        for(int i = 0; i<vetorA.length; i++){
          matriz[i][2] = vetorA[i]*10;
            
        }
        return matriz;
    }
    
    public static void main(String[] args) {
        int[] A = InsereDados(12);
        int[] B = InsereDados(12);
        
        
        double[][] matriz = new double[12][3];
        
  
        
        
        
    }
    
}
