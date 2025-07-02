package Matrix;

public class p19_find_value_in_sorted_row_and_column_time_com_row_into_log_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5},
                {4,9,10},
                {7,12,16},
                {11,13,20},
        };

        int row = mat.length;
        int col = mat[0].length;
        int k = 12;

        for (int i = 0; i < row; i++){
            int left = 0, right = col - 1;
            while (left <= right){
                int mid = (left+right) / 2;

                if (mat[i][mid] == k){
                    System.out.println("present");
                    return;
                }
                else if (k > mat[i][mid]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("not present");
    }
}
// time com:- row * log(column)