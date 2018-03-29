
package numerocrescente;
import javax.swing.JOptionPane;

public class NumeroCrescente {

    public static void main(String[] args) {
      int valor1, valor2, valor3;
      String frase = "Segue na ordem crescente:\n";
      
      valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número"));
      valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número"));
      valor3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro número"));
      
      if (valor1 > valor2 && valor2 > valor3){    
          JOptionPane.showMessageDialog(null, valor1+" "+valor2+" "+valor3);
      }
      else if(valor1 > valor3 && valor3 > valor2) {
      }
      else if(valor2 > valor1 && valor1 > valor3){
      }
      else if(valor2 > valor3 && valor3 > valor1){
      }
      else if(valor3 > valor1 && valor1> valor2){
      }
      else if(valor3 > valor2 && valor2> valor1){
      }
        
    }
    
}
