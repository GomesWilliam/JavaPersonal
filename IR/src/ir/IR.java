
package ir;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class IR {

 
    public static void main(String[] args) {
        String nome, salario_texto, pergunta, frase;
        double salario, imposto;
        
        nome=JOptionPane.showInputDialog("Digite o nome do contribuinte");
        salario_texto =JOptionPane.showInputDialog("Digite o valor do salário");
        salario=Double.parseDouble(salario_texto);
        
        pergunta = JOptionPane.showInputDialog("O valor do salário é anual ou mensal? ");
        
        if(pergunta.toLowerCase().equals("mensal")){
            salario = salario * 13;
        }
        
        imposto = 0;
        if (salario > 60640.84) {
            imposto=salario*0.275;
        }
        else if (salario > 48743.66){
            imposto = salario*0.225;
        }
        else if(salario > 36746.46){
            imposto = salario*0.15; 
        }
        else if(salario > 22746.64){
            imposto =salario*0.075;
        }
        
        frase=String.format("O imposto devido pelo contribuinte:\n %s\n R$ %.2f", nome, imposto);
        JOptionPane.showMessageDialog(null, frase);
            
      
    
} 
} 
