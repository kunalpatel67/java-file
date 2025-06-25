package array;

public class count_negative_value {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 5, -2, -7};
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                count++;
            }
        }
        System.out.println("Negative value in array:" + count);
    }
}
