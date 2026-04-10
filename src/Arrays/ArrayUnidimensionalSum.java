package Arrays;

import java.util.Scanner;

public class ArrayUnidimensionalSum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n; double[] array;
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese la cantidad n: ");
        n = input.nextInt();
        array = new double[n];
        input.nextLine(); // limpiar buffer
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese Elemento["+i+"]");
            System.out.print("-> "); array[i] = input.nextDouble();
        }
        System.out.println("-----------------------------------------");
        mostrarArr(array, n);

    }

    public static double suma(double[] d, int n){
        int k; double s;
        k = 0;
        s = 0;
        while (k < n){
            s = s + d[k];
            if(k == 0){
                k = 2;
            }
            else{
                k = 2 * k;
            }
        }

        return s;
    }

    public static void mostrarArr(double[] d, int n){

        for (int i = 0; i < d.length; i++) {
            if(i == 0) System.out.print("[" + d[i] + ",");
            else if(i <= (d.length - 2) ) System.out.print(d[i] + ",");
            else if(i == (d.length - 1) ) System.out.print(d[i] +"]");
        }
    }
}
