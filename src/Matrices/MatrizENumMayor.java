package Matrices;

import AlgoritmosMatrices.AlgoritmoMatriz;

import java.util.Scanner;

public class MatrizENumMayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayor = 0;
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite un valor["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
                input.nextLine(); // limpiar buffer
            }

        }

        AlgoritmoMatriz.imprimirMatriz(matriz);

    }
}
