package bucles;

public class WhileE2 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println("While I");
            System.out.println("["+i+"]");
            int j = 1;
            while(j <= 10){
                j = j + 1;
                System.out.println("While J");
                System.out.println("["+j+"]");
            }
            i = i + 2;
        }
    }
}
