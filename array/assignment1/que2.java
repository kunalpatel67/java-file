package array.assignment1;

public class que2 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,9};

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
