package pattern.exam;

public class que1 {
    public static void main(String[] args) {
        int n = 5, temp = n;

        for (int i = 1; i <= n; i++){
            for(int j = 1; j<= temp; j++){
                System.out.print(i);
            }
            temp--;
            System.out.println();
        }
    }
}
