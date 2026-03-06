package Arrays;

import java.util.Scanner;

public class IngresarCalificaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] calificaciones = new double[6];
        System.out.print("---------------------------------------------\n");
        System.out.println("Ingrese Las Calificaciones De Los Estudiantes");
        System.out.print("---------------------------------------------\n");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion Estudiante["+i+"]");
            System.out.print("-> ");

            if(input.hasNextDouble()){
                calificaciones[i] = input.nextDouble();
                System.out.println("Calificacion Ingresada: " + calificaciones[i]);
            }else{
                System.out.println("Error: Ingrese Un Valor Numerico");
                input.next(); // limpiar buffer
                i--;
            }

        }

    }
}
