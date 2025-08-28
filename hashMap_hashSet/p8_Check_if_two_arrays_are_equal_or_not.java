package hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;

public class p8_Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};

        if (arr1.length != arr2.length){
            System.out.println("false");
            return;
        }

        HashMap<Integer,Integer> hashMap1 = new HashMap<>();
        HashMap<Integer,Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++){
            if (hashMap1.containsKey(arr1[i])){
                int exFre = hashMap1.get(arr1[i]);
                hashMap1.put(arr1[i], exFre+1);
            }
            else {
                hashMap1.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++){
            if (hashMap2.containsKey(arr2[i])){
                int exFre = hashMap2.get(arr2[i]);
                hashMap2.put(arr2[i], exFre+1);
            }
            else {
                hashMap2.put(arr2[i], 1);
            }
        }
        System.out.println(hashMap1.equals(hashMap2));
    }
}
