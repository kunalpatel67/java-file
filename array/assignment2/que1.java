package array.assignment2;

public class que1 {
    public static void main(String[] args) {
        int[] arr = {5,3,10,9,6,13};
        int a = -1;

        for (int i = 0; i < arr.length; i++){
            int max = arr[i];
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] > max){
                    max = arr[j];
                    break;
                }
            }
            if (arr[i] < max){
                System.out.print(max + " ");
            }
            else {
                System.out.print(a + " ");
            }
        }
    }
}
