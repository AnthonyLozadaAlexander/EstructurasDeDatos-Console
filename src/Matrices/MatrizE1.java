package Matrices;

import java.util.Scanner;

public class MatrizE1 {
    public static void main(String[] args) {
        int[][] MatrizEjemplo = {{3,3,3},
                                 {2,2,2},
                                 {1,1,1}};

        Scanner input = new Scanner(System.in);
        int f, c;
        System.out.println("Ingrese el Tamaño de la Matriz (f x c)");
        System.out.print("n -> "); f = input.nextInt();
        System.out.print("c -> "); c = input.nextInt();

        int[][] matriz = new int[f][c];
        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Ingrese el Elemento["+i+"]["+j+"]");
                System.out.print("-> ");
                matriz[i][j] = input.nextInt();
            }
        }

        mostrarMatriz(matriz, f, c);

    }

    public static void mostrarMatriz(int[][] matriz, int f, int c){
        System.out.println("-------------------------------------");
        for (int i = 0; i < f; i++) {
            if(i == 0){ // primera fila
                System.out.print("[");
            }
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
                if(i == f - 1 && j == c - 1){ // ultima columna
                    System.out.print("]");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
}
