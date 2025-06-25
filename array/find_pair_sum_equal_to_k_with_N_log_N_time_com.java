package array;

public class find_pair_sum_equal_to_k_with_N_log_N_time_com {
    public static void main(String[] args) {
        int[] arr = {2,5,7,10,15};
        int k = 12;

        for (int i = 0; i < arr.length - 1; i++){
            int temp = k - arr[i]; // 10
            int left = i + 1; // 1
            int right = arr.length - 1; // 4

            while (left <= right){
                int mid = (left + right) / 2; // 2
                if (arr[mid] == temp){ // 7 == 10
                    System.out.println("present");
                    return;
                }
                else if (arr[mid] < temp){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("not present");
    }
}
