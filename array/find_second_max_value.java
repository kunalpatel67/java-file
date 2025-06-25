package array;

public class find_second_max_value {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,40};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                secmax = max;
                max = arr[i];
            }

            else if (arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }

        if (secmax == Integer.MIN_VALUE){
            System.out.print("There is no second max value");
        }
        else {
            System.out.print("Secondmax value: " + secmax);
        }
    }
}
