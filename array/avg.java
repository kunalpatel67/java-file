package array;

public class avg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            count++;
        }

        System.out.println(sum / count);
    }
}
