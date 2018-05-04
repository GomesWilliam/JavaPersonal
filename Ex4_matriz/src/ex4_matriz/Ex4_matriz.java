/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_matriz;

import java.util.Scanner;

/**
 *
 * @author aline.panazio
 */
public class Ex4_matriz {
    
 public static double[][] InsereDados(int linhas, int colunas){
        
        double m[][]=new double[linhas][colunas];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<m.length; i++){
            System.out.println("Matriz: linha "+(i+1)+", "+ m[i].length +" colunas");  //separar elementos por espaço
            for(int j=0; j<m[i].length; j++){                                
                m[i][j]=sc.nextDouble();
            }           
        }     
        return m;
        
    }        
    
    public static void ImprimeMatriz(String frase, double mat[][]){
         System.out.println("A "+frase+" é:\n");
        for(int i=0; i<mat.length; i++){            
            for(int j=0; j<mat[i].length; j++){                
                System.out.printf("%.2f \t",mat[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public static double[][] RemoveLC(double M[][], int L, int C){
        
        int contL=0, contC;
        double N[][]=new double[M.length-1][M[0].length-1];
        for(int i=0;i<M.length;i++){
            if(i!=L){
                contC=0;
                for(int j=0;j<M[0].length;j++){
                    if (j!=C){
                        N[contL][contC]=M[i][j];
                        contC++;
                    }
                }
                contL++;
            }            
        }
        
        return N;                
    }
    
    
    public static void main(String[] args) {
        
        double Mat[][]=new double[10][10];
        double R[][]=new double[9][9];
        int l,c;
        
        Scanner sc=new Scanner(System.in);
        
        Mat=InsereDados(10,10);
        ImprimeMatriz("Matriz original",Mat);
        
        System.out.println("Digite a linha a ser removida");
        l=sc.nextInt();
        
        System.out.println("Digite a coluna a ser removida");
        c=sc.nextInt();
        
        R=RemoveLC(Mat,l,c);
        
        ImprimeMatriz("Resultado",R);
        
        
    }
    
}
