package array;

import java.util.Arrays;

public class check_how_many_element_smaller_than_current_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] countArr = new int[n];

        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] > arr[j]){
                    count++;
                }
            }
            countArr[i] = count;
        }
        System.out.println(Arrays.toString(countArr));
    }
}
