package array;

public class find_third_max_value {
    public static void main(String[] args) {
        int[] arr = {10,20,40,50,30};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                thirdmax = secmax;
                secmax = max;
                max = arr[i];
            }

            else if (arr[i] > secmax && arr[i] != max) {
                thirdmax = secmax;
                secmax = arr[i];
            }

            else if (arr[i] > thirdmax && arr[i] != secmax){
                thirdmax = arr[i];
            }
        }

        if (thirdmax == Integer.MIN_VALUE){
            System.out.print("There is no third max value");
        }
        else {
            System.out.print("Third max value: " + thirdmax);
        }
    }
}
