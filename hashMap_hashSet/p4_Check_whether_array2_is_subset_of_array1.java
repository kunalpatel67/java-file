package hashMap_hashSet;

import java.util.HashSet;

public class p4_Check_whether_array2_is_subset_of_array1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,5};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++){
            hashSet.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){
            if (!hashSet.contains(arr2[i])){
                System.out.print("not subset");
                return;
            }
        }
        System.out.println("Subset");
    }
}
