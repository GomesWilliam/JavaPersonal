
package calcmedia;

import java.util.Scanner;

public class CalcMedia {

    public static void main(String[] args) {
        double Listum, Listdois, Listtres, Listquatro, Mf, Ml, Mp, Provaum, Provadois,Projfinal;
        
        Scanner mediafinal = new Scanner(System.in);
        
        System.out.println("Digite a nota da lista 1: ");
        Listum = mediafinal.nextDouble();
        System.out.println("Digite a nota da lista 2: ");
        Listdois = mediafinal.nextDouble();
        System.out.println("Digite a nota da lista 3: ");
        Listtres = mediafinal.nextDouble();
        System.out.println("Digite a nota da Lista 4: ");
        Listquatro = mediafinal.nextDouble();
        
        
        System.out.println("Digite a nota da P1: ");
        Provaum = mediafinal.nextDouble();
        System.out.println("Digite a nota da P2: ");
        Provadois = mediafinal.nextDouble();
        
        System.out.println("Digite a nota do projeto final: ");
        Projfinal = mediafinal.nextDouble();
        
        Ml =(Listum+Listdois+Listtres+Listquatro)/4;
        Mp = (Provaum+Provadois)/2;
        Mf = 0.2*Ml + 0.5*Mp + 0.3*Projfinal;
        
        //System.out.println("Sua média nas listas de exercicio é: "+ Ml);
        //System.out.println("Sua média nas provas é: "+Mp);
        //System.out.println("Sua nota no projeto final é: "+ Projfinal);
        //System.out.printf("Sua nota final é %.2f ", Mf);
        System.out.printf(" Sua média nas listas de exercicio é %.2f\n Sua média nas provas é %.2f\n Sua nota no projeto final é %.2f\n Sua nota final é %.2f\n ", Ml, Mp, Projfinal, Mf);
        
        
        
        
        
    }
    
}
