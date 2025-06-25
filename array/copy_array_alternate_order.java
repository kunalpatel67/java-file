package array;

import java.util.Arrays;

public class copy_array_alternate_order {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int n = arr1.length;
        int[] arr3 = new int[n * 2];
        int j = 0;

        for (int i = 0; i < n; i++){
            arr3[j] = arr1[i];
            j++;
            arr3[j] = arr2[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
