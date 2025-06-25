package array.assignment2;

import java.util.Arrays;

public class que4 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 17, 22, 40, 1, 3, 5};
        int value = 3;
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == value){
                System.out.println("present");
                return;
            }
            else if (value > arr[mid]){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        System.out.println("not present");
    }
}
