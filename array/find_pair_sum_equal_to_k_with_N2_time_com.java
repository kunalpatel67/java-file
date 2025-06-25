package array;

public class find_pair_sum_equal_to_k_with_N2_time_com {
    public static void main(String[] args) {
        int[] arr = {8,2,0,9,13,28,6};
        int k = 15;

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == k){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}