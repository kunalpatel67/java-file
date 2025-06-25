package pattern.assignment2;

public class que9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (i % 2 == 0){
                    System.out.print("- ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        n--;

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                if (i % 2 == 0){
                    System.out.print("- ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
