package array;

import java.util.Arrays;

public class remove_duplicate_value {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i+1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n-1]; // for last element
        j++;

        for (int i = 0; i < j; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
