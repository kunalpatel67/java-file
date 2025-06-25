package array;

public class check_number_unique_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int num = 3, count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                count++;
            }
        }
        if (count == 1){
            System.out.println(num + " is a unique number");
        }
        else {
            System.out.println(num + " is not unique number");
        }
    }
}
