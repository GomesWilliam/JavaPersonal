package latastinta;

import java.util.Scanner;
public class LatasTinta {

      public static void main(String[] args) {
          double Comp, Larg, Result, Custo, Resultf;
          
          Scanner latas= new Scanner(System.in);
          
          System.out.println("Digite o comprimento: ");
          Comp = latas.nextDouble();
          System.out.println("Digite a largura: ");
          Larg = latas.nextDouble();
          
          Result = (Larg*Comp)/(5*3);
          Resultf = Math.ceil(Result);
          Custo = 45*Resultf;
          System.out.printf("A quantidade de latas de tinta é %.1f e o custo total é R$%.1f", Resultf, Custo);
    }
    
}
