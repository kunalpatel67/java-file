package array.assignment1;

import java.util.Arrays;

public class que3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int[] a1 = new int[n / 2];
        int[] a2 = new int[n / 2];

        if (n % 2 != 0){
            System.out.println("Error: You can't input odd array of length");
            return;
        }

        for (int i = 0; i < n/2; i++){
            a1[i] = arr[i];
            a2[i] = arr[i + n/2];
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

    }
}
