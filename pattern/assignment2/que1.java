package pattern.assignment2;
public class que1 {
    public static void main(String[] args) {
        int n = 7;
        if(n % 2 == 0){
            return;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == (n / 2) + 1 || i == (n / 2) + 1){
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