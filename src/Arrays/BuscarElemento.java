package Arrays;

public class BuscarElemento {
    static void main() {
        int[] numeros = {1,20,21,40,55,60}; // arreglo definido con 6 elementos
        int buscar = 60; // elemento a buscars

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == buscar){
                System.out.println("Elemento encontrado en la Pos["+i+"]");
                break;
            }
            else{
                System.out.println("Elemento No Existente en el arreglo");
            }

        }
    }
}
