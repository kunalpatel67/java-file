package recursion.Assignment;

public class p4_Recursive_binary_search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 50;
        int left = 0, right = arr.length-1;
        search(arr,target,left,right);
    }
    public static void search(int[] arr,int target,int left,int right) {
        if (left > right) {
            System.out.println("not present");
            return;
        }

        int mid = (left + right) / 2;
        if (arr[mid] == target){
            System.out.println("Present");
            return;
        }
        else if (target > arr[mid]){
            search(arr,target,mid+1,right);
        }
        else {
            search(arr,target,left,mid-1);
        }
    }
}
