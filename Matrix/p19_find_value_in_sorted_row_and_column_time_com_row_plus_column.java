package Matrix;

public class p19_find_value_in_sorted_row_and_column_time_com_row_plus_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5},
                {4,9,10},
                {7,12,16},
                {11,13,20},
        };

        int row = mat.length;
        int col = mat[0].length;
        int k = 22;

        int left = 0, right = col - 1;

        while (left < row && right >= 0){
            if (mat[left][right] == k){
                System.out.println("present");
                return;
            }
            else if (k > mat[left][right]){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
/* time com = O(row+col) */