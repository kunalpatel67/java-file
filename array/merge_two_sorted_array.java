package array;

import java.util.Arrays;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] a1 = {1,5,9,7,10};
        int[] a2 = {3,6,8,11,16,20};
        int n1 = a1.length;
        int n2 = a2.length;
        int[] a3 = new int[n1+n2];
        int j = 0;

        for (int i = 0; i < n1; i++){
            a3[j] = a1[i];
            j++;
        }
        for (int i = 0; i < n2; i++){
            a3[j] = a2[i];
            j++;
        }

        for (int i = 0; i < a3.length - 1; i++){
            for (int k = 0; k < a3.length - 1 - i; k++){
                if (a3[k] > a3[k+1]){
                    int temp = a3[k];
                    a3[k] = a3[k+1];
                    a3[k+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}
