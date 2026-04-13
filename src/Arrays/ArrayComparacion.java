package Arrays;

import java.util.Scanner;

public class ArrayComparacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notas; int n; int i = 0;
        System.out.print("Ingrese el numero de notas a ingresar: ");
        n = input.nextInt(); notas = new int[n];
        ingresarNotas(notas, input);
        mostrarNotas(notas);
    }

    public static int[] ingresarNotas(int[] notas, Scanner input){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota["+i+"]");
            notas[i] = input.nextInt();
        }
        return notas;
    }

    public static void mostrarNotas(int[] notas){
        int i = 0;
        while(i < notas.length){
            System.out.println("La nota["+i+"]: " + notas[i]);
            i++;
        }
    }

    public static int NotaMaxima(int[] notas){
        int max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > max){
                max = notas[i];
            }
        }

        return max;
    }

}
