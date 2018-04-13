
package imc;

import java.util.Scanner;


public class IMC {

    public static void main(String[] args) {
       double altura, peso, imc_result;
       
       Scanner imc = new Scanner(System.in);
       
        System.out.println("Digite seu peso");
        peso = imc.nextDouble();
        System.out.println("Digite sua altura");
        altura = imc.nextDouble();
        
        imc_result = peso / Math.pow(altura, 2);
        
        if(imc_result < 18.5){
            System.out.println("Você está abaixo do peso ideal");
        }
        else if (imc_result < 25) {
            System.out.println("Parabéns - Você está no seu peso ideal");
        }
        else if(imc_result < 30) {
            System.out.println("Você está acima do seu peso (sobrepeso)");
        }
        else if(imc_result < 35) {
            System.out.println("Obesidade grau I ");
        }
        else if(imc_result < 40){
            System.out.println("Obesidade grau II");
        
        }
        else{
            System.out.println("Obesidade grau III");
        }
      
        
        System.out.println("Seu Imc é "+ imc_result);
        
        
        
        
        
    }
    
}
