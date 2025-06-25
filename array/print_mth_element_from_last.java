package array;

public class print_mth_element_from_last {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int m = 3; // print last 3rd value of array

        System.out.println(arr[arr.length - m]);
    }
}
