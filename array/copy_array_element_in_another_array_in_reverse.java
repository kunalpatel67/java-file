package array;

import java.util.Arrays;

public class copy_array_element_in_another_array_in_reverse {
    public static void main(String[] args) {
        int[] a1 = {2,8,7,5,9,6};
        int n = a1.length;
        int[] a2 = new int[n];

        for (int i = 0; i < n; i++){
            a2[i] = a1[(n - i) - 1];
        }

        System.out.println(Arrays.toString(a2));
    }
}
