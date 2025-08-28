package hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class p5_Count_frequency_of_each_number_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,2,3};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                int exFre = hashMap.get(arr[i]);
                hashMap.put(arr[i], exFre+1);
            }
            else {
                hashMap.put(arr[i], 1);
            }
        }

        for (Map.Entry me : hashMap.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }

    }
}
