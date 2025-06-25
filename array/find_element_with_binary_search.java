package array;

public class find_element_with_binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 1;

        int left = 0, right = arr.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == target){
                System.out.println("present");
                return;
            }
            else if (target > arr[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("not present");
    }
}