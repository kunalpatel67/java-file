package array;

import java.util.Arrays;

public class Reverse_an_array_in_memory {
    public static void main(String[] args) {
        int[] arr = {2,8,10,9,6,5};
        int n = arr.length, j = n - 1;

        for (int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}