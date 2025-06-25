package array;

public class print_only_unique_num_in_one_array {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,4,5};

        for (int i = 0; i < arr.length; i++){
            int c = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    c++;
                }
            }
            if (c == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
