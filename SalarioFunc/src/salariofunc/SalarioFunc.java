
package salariofunc;

import java.util.Scanner;

public class SalarioFunc {

    public static void main(String[] args) {
        double Dependentes, SalarioLiquido, HorasTrabalhadas, SalarioBruto;
        String Funcionario;
        
        Scanner sal = new Scanner(System.in);
        
        System.out.println("Nome do funcionário: ");
        Funcionario = sal.next();
        System.out.println("Horas trabalhadas: ");
        HorasTrabalhadas = sal.nextDouble();
        System.out.println("Número de dependentes: ");
        Dependentes = sal.nextDouble();
        
        SalarioBruto = 15 * 30 * HorasTrabalhadas;
        SalarioLiquido = Dependentes * 100 + SalarioBruto * 0.865;
        
        System.out.println("Nome do Funcionário: " + Funcionario);
        System.out.println("Salário: " + SalarioLiquido);
        
        
    }
    
}
