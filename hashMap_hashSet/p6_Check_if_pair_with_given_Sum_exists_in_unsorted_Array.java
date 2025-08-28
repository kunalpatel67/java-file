package hashMap_hashSet;

import java.util.HashSet;

public class p6_Check_if_pair_with_given_Sum_exists_in_unsorted_Array {
    public static void main(String[] args) {
        int[] arr = {40,20,5,35,10,6};
        int sum = 16;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            int temp = sum - arr[i];
            if (hashSet.contains(temp)){
                System.out.println("pair present");
                return;
            }
            hashSet.add(arr[i]);
        }
        System.out.println("pair not present");
    }
}
