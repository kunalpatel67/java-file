package array;

import java.util.Arrays;

public class merge_two_sorted_array_with_N_time_com {
    public static void main(String[] args) {
        int[] a1 = {1,5,9,7,10};
        int[] a2 = {3,6,8,11,16,20};
        int n1 = a1.length;
        int n2 = a2.length;
        int[] a3 = new int[n1+n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2){
            if (a1[i] < a2[j]){
                a3[k] = a1[i];
                i++;
                k++;
            }
            else {
                a3[k] = a2[j];
                j++;
                k++;
            }
        }
        while (i < n1){
            a3[k] = a1[i];
            k++;
            i++;
        }
        while (j < n2){
            a3[k] = a2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
