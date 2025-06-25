package array;

public class print_sum_of_even_num {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
