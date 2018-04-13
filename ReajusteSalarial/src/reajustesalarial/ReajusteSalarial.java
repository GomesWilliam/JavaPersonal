
package reajustesalarial;

import javax.swing.JOptionPane;


public class ReajusteSalarial {

    public static void main(String[] args) {
        String sexo, anos_de_casa_texto, salario_texto, dependentes, frase;
        int anos_de_casa;
        double reajuste, salario, salario_atual;
               
        sexo = JOptionPane.showInputDialog("Digite o sexo: M ou F");
        anos_de_casa_texto = JOptionPane.showInputDialog("Quantos anos de casa?");
        anos_de_casa= (int) Double.parseDouble(anos_de_casa_texto);
        salario_texto= JOptionPane.showInputDialog("Digite o salário");
        salario = Double.parseDouble(salario_texto);
        dependentes = JOptionPane.showInputDialog("Mais de um dependente? S ou N");
        
        
        
       if(sexo.toLowerCase().equals("m")){
          if(anos_de_casa < 10){
              reajuste = salario*0.03;
          }
          else{
              reajuste = salario*0.05;
          }
       }
       else { 
            if(anos_de_casa < 8) {
                reajuste = salario*0.03;
            }
            else{
                reajuste = salario*0.05;
            }
        }
        
      if(dependentes.toLowerCase().equals("s")){
          salario_atual = (salario + reajuste)*1.02;
                  
      }
      else{
          salario_atual = salario + reajuste;
      }
      
       
        frase = String.format("Seu reajuste foi de %.2f\nSalario atual %.2f", reajuste, salario_atual);
        JOptionPane.showMessageDialog(null, frase);
}
}
