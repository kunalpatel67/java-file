package array;

public class find_largest_contiguous_Sum {
    public static void main(String[] args) {
        int[] arr = {2,4,-5,3,1,2,-6,2};
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            int tempsum = 0;
            for (int j = i; j < arr.length; j++){
                tempsum = tempsum + arr[j];
                if (tempsum > maxsum){
                    maxsum = tempsum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
