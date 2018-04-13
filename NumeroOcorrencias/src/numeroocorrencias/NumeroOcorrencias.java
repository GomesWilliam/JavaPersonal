
package numeroocorrencias;

import java.util.Scanner;


public class NumeroOcorrencias {

    public static void main(String[] args) {
      long vector[] = new long[10];
      long n;
      int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0;
      Scanner ler = new Scanner(System.in);
      
        System.out.println("Digite um número de 0 a 9, -1 para sair\n");
        n = ler.nextLong();
        
      while(n != -1 ){
          if(n == 0){
              a++;
              vector[0]=a; 
          }
          else if(n == 1){
              b++;
              vector[1]=b;          
          }
          else if(n == 2){
              c++;
              vector[2]=c;          
          }
          else if(n == 3){
              d++;
              vector[3]=d;          
          }
          else if(n == 4){
              e++;
              vector[4]=e;          
          }
          else if(n == 5){
              f++;
              vector[5]=f;          
          }
          else if(n == 6){
              g++;
              vector[6]=g;          
          }
          else if(n == 7){
              h++;
              vector[7]=h;          
          }
          else if(n == 8){
              i++;
              vector[8]=i;          
          }
          else if(n == 9){
              j++;
              vector[9]=j;          
          }
          else{
              System.out.println("Número inválido");
          
          }
      
           System.out.println("Digite um número de 0 a 9, -1 para sair");
           n = ler.nextLong();
      }
      
        System.out.println("");
      
      for(int cont=0; cont<10; cont++){
          System.out.printf("%5d", vector[cont]);
      }
      
        System.out.println("\n");
      
    }
    
}
