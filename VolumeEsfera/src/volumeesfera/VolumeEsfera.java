
package volumeesfera;

import java.util.Scanner;

public class VolumeEsfera {

    public static void main(String[] args) {
        double Raio, Volume;
        
        Scanner vol= new Scanner(System.in);      
      
        System.out.println("Digite o Raio da esfera: ");
        Raio = vol.nextDouble();
        
        Volume = Math.pow(Raio,3)*(4.0/3)*Math.PI;
        
        System.out.printf("O volume da esfera de raio %.3f é %.3f ",Raio, Volume);
    }
    
}
