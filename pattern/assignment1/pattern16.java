package pattern.assignment1;

public class pattern16 {
    public static void main(String[] args) {
        int n = 5, temp = n;

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n - i; k++){
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            for (int j = 1; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        n--;

        for (int i = n; i >= 1; i--){
            for (int k = 1; k <= temp - i; k++){
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            for (int j = 1; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}