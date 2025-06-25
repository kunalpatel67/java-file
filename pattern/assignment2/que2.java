package pattern.assignment2;

public class que2 {
    public static void main(String[] args) {
        int n = 5;

        if( n < 3 || n % 2 == 0){
            return;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j || i + j == n + 1){
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