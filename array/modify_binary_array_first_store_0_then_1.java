package array;

import java.util.Arrays;

public class modify_binary_array_first_store_0_then_1 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,1};
        int countzero = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                countzero++;
            }
        }

        for (int i = 0; i < countzero; i++){
            arr[i] = 0;
        }

        for (int i = countzero; i < arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //or
//    int left = 0;
//    int right = arr.length - 1;
//    while(left < right) {
//        if (arr[left] == 0){
//            left++;
//        }
//        else if (arr[right] == 1){
//            right--;
//        }
//        else {
//            arr[left] = 0;
//            arr[right] = 1;
//            left++;
//            right--;
//        }
//    }
}




