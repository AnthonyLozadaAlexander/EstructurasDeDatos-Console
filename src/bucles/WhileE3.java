package bucles;

public class WhileE3 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println("While I");
            System.out.println("["+i+"]");
            int j = 1;
            while(j <= 10){
                System.out.println("While J");
                System.out.println("["+j+"]");
                j = j + 1;
            }
            i = i + 2;
        }
    }
}
