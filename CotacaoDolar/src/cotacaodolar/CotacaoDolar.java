package cotacaodolar;

import java.util.Scanner;


public class CotacaoDolar {

    public static void main(String[] args) {
        double Cotacao, Valor, Conversao;
        
        Scanner realdolar = new Scanner(System.in);
        
        System.out.println("Digite a cotação do Dólar em reais: ");
        Cotacao = realdolar.nextDouble();
        System.out.println("Digite o valor desejado em dólares: ");
        Valor = realdolar.nextDouble();
        
        Conversao = Cotacao * Valor;
        
        System.out.printf("O valor solicitado foi de $%.2f e a conversão para reais é de R$ %.2f\n", Valor, Conversao);
        
    }
    
}
