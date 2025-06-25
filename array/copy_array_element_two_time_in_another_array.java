package array;

import java.util.Arrays;

public class copy_array_element_two_time_in_another_array {
    public static void main(String[] args) {
        int[] arr = {1,5,9,10};
        int n = arr.length;
        int[] arr2 = new int[n * 2];

        for (int i = 0; i < n; i++){
            arr2[i] = arr[i];
            arr2[i+n] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}