package Matrices;

import java.util.Scanner;

public class MatrizE2_Sum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int i,j= 0; int[][] Matriz = new int[3][3];
        for (i = 0; i < Matriz.length; i++) { // filas
            for (j = 0; j < Matriz[i].length; j++) {
                System.out.println("Ingrese el Elemento["+i+"]["+j+"]");
                System.out.print("-> ");
                Matriz[i][j] = input.nextInt();
            }
        }

        mostrarMatriz(Matriz, Matriz.length, Matriz[0].length);
        int res = sumarMatriz(Matriz, Matriz.length, Matriz[0].length);
        System.out.println("La suma de la matriz es de: " + res);

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

    public static int sumarMatriz(int[][] matriz, int f, int c){
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                suma = suma + matriz[i][j];
            }
        }

        return suma;
    }

}
