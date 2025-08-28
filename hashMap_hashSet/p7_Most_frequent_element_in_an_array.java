package hashMap_hashSet;

import java.util.HashMap;
import java.util.Map;

public class p7_Most_frequent_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,2};

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
        int maxFreq = Integer.MIN_VALUE;
        int element = -1;
        for (int i = 0; i < arr.length; i++){
            int freq = hashMap.get(arr[i]);
            if (freq > maxFreq){
                maxFreq = freq;
                element = arr[i];
            }
        }
        System.out.println(element);
    }
}
