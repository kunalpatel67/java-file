package array;

public class find_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 5;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");
    }
}
