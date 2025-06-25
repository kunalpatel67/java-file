package array;

import java.util.Arrays;

public class modify_array_first_store_odd_then_even {
    public static void main(String[] args) {
        int[] arr = {2,5,6,10,9,13};
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] % 2 == 1){
                left++;
            }
            else if (arr[right] % 2 == 0){
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}