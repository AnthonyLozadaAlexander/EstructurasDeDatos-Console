package bucles;

import java.util.Scanner;

public class ForE1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int z = 0, n=0;
        System.out.println("------------------------------");
        System.out.println("       Ejercicio For");
        System.out.println("------------------------------");
        System.out.println("Ingrese n: ");
        n = input.nextInt();
        input.nextLine(); // limpiar buffer
        System.out.println("------------------------------");
        // int res = sumaN(n, z);
        System.out.println("La suma desde 0 hasta " + n + " es: " + sumaN(n, z));

    }

    public static int sumaN(int n, int z){

        for (int i = 0; i < n; i++) {
            z = z + 1;
        }
        return z;
    }
}
