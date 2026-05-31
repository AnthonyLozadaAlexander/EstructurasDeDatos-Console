package Bucles;

class DobleFor {
    static void main(String[] args) {
        int n = 6;
        System.out.println("El resultado de la funcion BigO es: " + BigO(n));
    }

    static int BigO(int n){
        int z = 0;
        for (int i = n; i > 1; i /= 2) {
            for (int j = 1; j <= n; j++) {
                z++;
            }
        }
        return z;
    }
}

