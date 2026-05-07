package Matrices;

import java.util.Scanner;

public class MatrizE3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, mayor = 0;
        int[][] matriz = new int[3][3];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++){
                System.out.print("Ingrese El Elemento De ["+i+"]["+j+"]");
                matriz[i][j] = input.nextInt();
            }
        }
    }


}
