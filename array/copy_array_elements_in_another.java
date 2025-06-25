package array;

import java.util.Arrays;

public class copy_array_elements_in_another {
    public static void main(String[] args) {
        int[] a1 = {3,5,2,6,7,9};
        int n = a1.length;
        int[] a2 = new int[n];

        for (int i = 0; i < n; i++){
            a2[i] = a1[i];
        }
        System.out.println(Arrays.toString(a2));
    }
}
