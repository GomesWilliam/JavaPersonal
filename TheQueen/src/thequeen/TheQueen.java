package thequeen;

import java.util.Scanner;

public class TheQueen {

    public static void main(String[] args) {
        int l, c;
        int tabu[][] = new int[8][8];

        Scanner queen = new Scanner(System.in);

        System.out.println("Digite a linha que a Raínha se encontra: ");
        l = queen.nextInt();
        System.out.println("Digite a coluna que a raínha se encontra: ");
        c = queen.nextInt();
        
        l--;
        c--;

        //preenchendo a horizontal
        for (int i = 0; i < 8; i++) {
            tabu[l][i] = 1;
        }

        //preenchendo a vertical
        for (int i = 0; i < 8; i++) {
            tabu[i][c] = 1;
        }

        //diagonal principal
        int cont = 0;
        while (l + cont < 8 && c + cont < 8) {
            tabu[l + cont][c + cont] = 1;
            cont++;
        }
        cont = 0;
        while (l - cont >= 0 && c - cont >= 0) {
            tabu[l - cont][c - cont] = 1;
            cont++;
        }

        //diagonal segundária
        cont = 0;
        while (l - cont >= 0 && c + cont < 8) {
            tabu[l - cont][c + cont] = 1;
            cont++;
        }
        cont = 0;
        while (l + cont < 8 && c - cont >= 0) {
            tabu[l + cont][c - cont] = 1;
            cont++;
        }
        
        //exibindo a matriz no final do programa
        System.out.println("\n");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%-5d", tabu[i][j]);
            }
            System.out.println("\n");
        }
    }

}
