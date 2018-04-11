
package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        double Ax, Ay, Bx, By, Cx, Cy, D;
        
        Scanner tri = new Scanner(System.in);
        
        System.out.println("Vértice A\nDigite a coordenada X: ");
        Ax = tri.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        Ay = tri.nextDouble();
        System.out.println("Vértice B\nDigite a coordenada X: ");
        Bx = tri.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        By = tri.nextDouble();
        System.out.println("Vértice C\nDigite a coordenada X: ");
        Cx = tri.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        Cy = tri.nextDouble();
        
       D = Math.abs((Ax*By + Ay*Cx + Bx*Cy) - (By*Cx + Bx*Ay + Ax*Cy))/2.0;
       
       System.out.println("A área do triângulo é: " + D);
     
    }
    
}
