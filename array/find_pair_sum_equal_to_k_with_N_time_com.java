package array;

import java.util.Arrays;

public class find_pair_sum_equal_to_k_with_N_time_com {
    public static void main(String[] args) {
        int[] arr = {0,2,6,8,9,13,28};
        int k = 30;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                System.out.println("Present");
                return;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not present");
    }
}