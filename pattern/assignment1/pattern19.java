package pattern.assignment1;

public class pattern19 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++){
                if(i == n || j == 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            for(int j = 1; j < i; j++){
                if(i == n || j == i - 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
