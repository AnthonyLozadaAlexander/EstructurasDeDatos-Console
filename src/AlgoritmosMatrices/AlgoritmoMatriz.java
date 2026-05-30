package AlgoritmosMatrices;

public class AlgoritmoMatriz {
    public static void imprimirMatriz(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if(i == 0){
                System.out.print("[ ");
            }
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
                if(i == matrix.length - 1 && j == matrix[i].length - 1) System.out.print(" ]");
            }

            System.out.println();
        }
    }
}
