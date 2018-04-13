
package vetorsalfun;

import java.util.Scanner;

public class VetorSalFun {

    public static void main(String[] args) {
        String nome[]= new String[10];
        double sal[]= new double[10];
        String n;
        int cont=0;
        double s, soma=0, media, maior=0;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("De enter para iniciar: ");
        for(int i=0; i<10; i++){
            ler.nextLine();
            System.out.println("Digite o nome do funcionário: ");
            n = ler.nextLine();
            nome[i]=n;
            
            System.out.println("Digite o salário do funcionário: ");
            s = ler.nextDouble();
            sal[i]=s;   
            
            soma+=sal[i];
            cont++;
           
        }
        
        media = soma/cont;
        
        System.out.println("\nMédia Salarial: \n"+media);
        System.out.println("");
        System.out.println("Pessoas com salário abaixo da media salarial");
        System.out.println("");
        for(int i=0; i<10; i++){
            
            if(sal[i]<media){
            System.out.println(nome[i]);
            System.out.println(sal[i]);
            System.out.println("");
            }
            
            if(sal[i]>maior){
                maior = sal[i];
            
            }
        }
        System.out.println("");
        System.out.println("Maior Salario");
        System.out.println("");
        for(int i=0; i<10; i++){
                       
            if(maior== sal[i]){
                System.out.println(nome[i]);
                System.out.println(sal[i]);
            
            }
        }
                
    }
    
}
