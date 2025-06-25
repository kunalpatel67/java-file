package array;

import java.util.Arrays;

public class copy_first_all_odd_then_even {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int n = a1.length;
        int[] a2 = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++){
            if (a1[i] % 2 != 0){
                a2[j] = a1[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++){
            if (a1[i] % 2 == 0){
                a2[j] = a1[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(a2));
    }
}
