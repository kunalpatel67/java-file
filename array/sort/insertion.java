package array.sort;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {3,8,4,0,5};
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            for ( ;j >= 0 && arr[j] > temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
