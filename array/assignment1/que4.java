package array.assignment1;

public class que4 {
    public static void main(String[] args) {
        int[] arr = {6,3,5,2,7,6};
        int d = 6, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d){
                count++;
            }
        }
        System.out.println(count);
    }
}
