package array;

import java.util.Arrays;

public class Left_rotate_an_array_by_d_positions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;

        for (int i = 0; i < d; i++){
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
