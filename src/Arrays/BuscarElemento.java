package Arrays;

public class BuscarElemento {
    public static void main() {
        int[] numeros = {1,20,21,40,55,60}; // arreglo definido con 6 elementos
        int buscar = 60; // elemento a buscars
        boolean encontrado = false; // indicar si se encontro el elemento

        System.out.println("Arreglo De Numeros\n");
        for(int i : numeros){
            System.out.print("["+i+"]");
        }

        System.out.println("\n---------------------------------------------\n");

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == buscar){
                System.out.println("Elemento encontrado en la Pos["+i+"]");
                encontrado = true;
                break;
            }

            if(!encontrado){
                System.out.println("Elemento No Existente En El Arreglo");
            }

        }
    }
}
