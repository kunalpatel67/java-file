package array;

public class Print_elements_greater_than_the_average_of_the_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        float avg = (float) sum / arr.length;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > avg){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
