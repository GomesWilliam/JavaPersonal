
package aula8ex4;

import java.util.Scanner;


public class Aula8Ex4 {
    public static double[][] InsereDados(int linha, int coluna){
        double[][] Matriz = new double[linha][coluna];
        int valor;
        Scanner ler = new Scanner(System.in); 
        for(int i=0; i<linha;i++){
            for(int j=0; j<coluna;j++){
               System.out.println("Digite os valores para a linha "+i+" com "+coluna+" colunas");
                valor = ler.nextInt();
                Matriz[i][j] = valor ;
            }
        }
         return Matriz;   
    
    }
    
    public static void main(String[] args) {
        
        double[][] mat= InsereDados(3,3);
        
        
         for(int i=0; i<3; i++){
           for(int j=0; j<3;j++){
               System.out.printf("%.0f                     ",mat[i][j]);
           }
           System.out.println(" ");
        }
    }
        
        
        
        
    }
    

