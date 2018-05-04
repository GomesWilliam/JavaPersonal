/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_v1;

import javax.swing.JOptionPane;
public class Ex2_v1 {

   public static int[][] Coluna1(int vet1[], int vet2[], int result[][]){
        
        for(int i=0; i<result.length; i++){
            result[i][0]=vet1[i]+vet2[i];
        }
        return result;
    }
    
    public static int[][] Coluna2(int vet[], int result[][]){
       
        for(int i=0; i<result.length; i++){
            result[i][1]=5*vet[i];
        }
        return result;
    }
    
    public static int[][] Coluna3(int vet[], int result[][]){
        
        for(int i=0; i<12; i++){
            result[i][2]=vet[11-i];
        }
        return result;
    }       
    
    public static void ImprimeMatriz(String frase, int mat[][]){
         System.out.println("A "+frase+" é:\n");
        for(int i=0; i<mat.length; i++){            
            for(int j=0; j<mat[i].length; j++){                
                System.out.printf("%d \t",mat[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        int vetA[]=new int[12];
        int vetB[]=new int[12];
        int matC[][]=new int[12][3];
        
        for(int i=0; i<12; i++){
            vetA[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor A "+i));
            vetB[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor B "+i));
        }
        
    matC=Coluna1(vetA,vetB,matC);
    matC=Coluna2(vetB,matC);
    matC=Coluna3(vetA,matC);
        
     ImprimeMatriz("A matriz C", matC);
   
    }
    
}
