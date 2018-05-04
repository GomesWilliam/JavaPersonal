
package aula;

import java.util.Scanner;

 
public class Aula {

    public static void investment(double capital, double taxa, int meses) {  

        double montante;

        for(int i=1; i<=meses; i++){
            montante = capital* Math.pow((1+(taxa/100)), i);
            System.out.printf("\nO valor no mes %d para uma taxa de juros de %.2f é de:  %.2f\n",i,taxa,montante);
        }  
        
    }
        
        

    public static void main(String[] args) {
        int meses;
        double mont,mont2, valor_inicial, juros, juros2;
        
        Scanner imprimir = new Scanner(System.in);
        
        System.out.println("Digite o montante inicial: ");
        valor_inicial = imprimir.nextDouble();
        System.out.println("Digite a taxa de juros(ao mês)");
        juros = imprimir.nextDouble();
        System.out.println("Digite uma outra taxa de juros (ao mês)");
        juros2 = imprimir.nextDouble();
        System.out.println("Digite a vigência do investimento: ");
        meses = imprimir.nextInt();
        
        Aula taxa1 = new Aula();
        Aula taxa2 = new Aula();
        
        taxa1.investment(valor_inicial, juros, meses);
        taxa2.investment(valor_inicial, juros2, meses);
        
  
    
    }
    
}
