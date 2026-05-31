package Matrices;

import AlgoritmosMatrices.AlgoritmoMatriz;

import java.util.Scanner;

public class MatrizESumaDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Digite un valor["+i+"]["+j+"]: ");
                matrix[i][j] = input.nextInt();
                input.nextLine(); // limpiar buffer
            }

        }

        AlgoritmoMatriz.imprimirMatriz(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    sum = sum + matrix[i][j];
                }
            }

        }

        System.out.println("La suma de la diagonal es de: " + sum);
        input.close();
    }
}
