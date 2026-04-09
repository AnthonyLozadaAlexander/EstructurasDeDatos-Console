package bucles;

public class whileE {
    public static void main(String[] args) {
        int i=1, n=2, j;
        while(i <= n){
            System.out.println("While I");
            System.out.println("["+i+"]");
            j = 1;
            while(j <= n){
                j = j*2;
                System.out.println("While J");
                System.out.println("["+j+"]");
            }
            i++;
        }
    }
}
