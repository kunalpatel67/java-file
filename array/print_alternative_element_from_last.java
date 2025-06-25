package array;

public class print_alternative_element_from_last {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        for (int i = arr.length - 1; i >= 0; i = i - 2){
            System.out.print(arr[i] + " ");
        }
    }
}
