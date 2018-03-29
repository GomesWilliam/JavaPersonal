
package hellojava;

import java.util.Scanner;

public class HelloJava {
      public static void main(String[] args) {
      int n, tmp1=0, tmp2=1, aux, cont=1;
      Scanner tb = new Scanner(System.in);
          System.out.println("Digite o número de termos da sequência de Fibonacci");
          n = tb.nextInt();
          while(cont<=n){
              System.out.println(tmp2 +"  ");
              aux = tmp2;
              tmp2=tmp1+tmp2;
              tmp1=aux;
              cont++;
          }
      
      
          }
      
    }
    

