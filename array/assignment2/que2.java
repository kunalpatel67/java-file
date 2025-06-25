package array.assignment2;

public class que2 {
    public static void main(String[] args) {
        int[] arr = {2,7,4,7,8,3,4,8,9,9};
        int k = 1;

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j] && k <= 2){
                    System.out.print(arr[i] + " ");
                    k++;
                    break;
                }
            }
        }
    }
}
