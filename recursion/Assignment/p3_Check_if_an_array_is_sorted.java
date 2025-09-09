package recursion.Assignment;

public class p3_Check_if_an_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean ans = sortOrNot(arr,0);
        System.out.println(ans);
    }
    public static boolean sortOrNot(int[] arr,int index){
        if (index == arr.length-1){
            return true;
        }

        if (arr[index] > arr[index+1]){
            return false;
        }
        return sortOrNot(arr,index+1);
    }
}
