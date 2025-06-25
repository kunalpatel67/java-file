package pattern.assignment1;

import java.awt.image.RasterOp;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5, a = 1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a % 2);
                a++;
            }
            System.out.println();
        }
    }
}
