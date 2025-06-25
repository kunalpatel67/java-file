package array;

public class find_largest_contiguous_sum_with_N_time_com {
    public static void main(String[] args) {
        int[] arr = {2,4,-5,3,1,2,-6,2};
        int maxsum = Integer.MIN_VALUE;
        int tempsum = 0;

        for (int i = 0; i < arr.length; i++){
            tempsum = tempsum + arr[i];
            if (tempsum > maxsum){
                maxsum = tempsum;
            }
            if (tempsum < 0){
                tempsum = 0;
            }
        }
        System.out.println(maxsum);
    }
}
