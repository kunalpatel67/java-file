package recursion;

public class p4_Print_the_array_elements_without_using_loop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr,0);
    }
    private static void printArray(int[] arr, int index) {
        if (index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }
}
