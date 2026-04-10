package Matrices;

import java.util.Scanner;

public class MatrizE1 {
    public static void main(String[] args) {
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

    }

    public void mostrarMatriz(int[][] matriz, int f, int c]){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {

            }

        }

    }
}
