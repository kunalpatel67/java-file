package array;

public class check_element_present_or_not {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;

        for (int i = 0; i < arr.length; i++){
            if (k == arr[i]){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
