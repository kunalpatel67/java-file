package hashMap_hashSet;

import java.util.HashSet;

public class p1_Print_all_distinct_numbers_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6};
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }
}
