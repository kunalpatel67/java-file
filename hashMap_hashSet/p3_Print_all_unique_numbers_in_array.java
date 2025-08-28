package hashMap_hashSet;

import java.util.HashSet;

public class p3_Print_all_unique_numbers_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,2};

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            if (hashSet.contains(arr[i])){
                duplicate.add(arr[i]);
            }
            else {
                hashSet.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (!duplicate.contains(arr[i])){
                unique.add(arr[i]);
            }
        }
        System.out.println(unique);
    }
}
