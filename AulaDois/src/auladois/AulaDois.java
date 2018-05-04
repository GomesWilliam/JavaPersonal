
package auladois;

import java.util.Scanner;

public class AulaDois {

    public static double[] investment(double capital, double taxa, int meses) {  
	//variável 
        double montante[]= new double[meses];
        double valor;
    
        for(int i=1; i<=meses; i++){
            valor = capital* Math.pow((1+(taxa/100)), i);
            montante[i-1] = valor;    
        } 
        
        return montante;
    }
    
    
    public static void main(String[] args) {
        int meses;
        double valor_inicial, juros;
       
       Scanner imprimir = new Scanner(System.in);
        
        System.out.println("Digite o montante inicial: ");
        valor_inicial = imprimir.nextDouble();
        System.out.println("Digite a taxa de juros(ao mês)");
        juros = imprimir.nextDouble();
        System.out.println("Digite a vigência do investimento: ");
        meses = imprimir.nextInt();
       
       
       
       double vector[]= investment(valor_inicial, juros, meses);
       
       
       for(int i = 0; i< vector.length; i++){
           System.out.printf("%.2f\n",vector[i]);
       }
        
        
    }
    
}
