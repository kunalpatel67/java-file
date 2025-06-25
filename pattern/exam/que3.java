package pattern.exam;

public class que3 {
    public static void main(String[] args) {
        int n = 5, k = 1;

        for(int i = 1; i <= n; i++){

            for(int j = i; j <= n; j++){
                if(k % 2 == 0){
                    System.out.print("# ");
                }
                else {
                    System.out.print("* ");
                }
                k++;
            }
            System.out.println();
        }
    }
}
