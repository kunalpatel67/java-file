package Matrix;

public class p20_Find_element_from_sorted_matrix_time_com_log_row_plus_log_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,5,8,10},
                {13,17,19,23},
                {27,30,35,38},
                {40,44,48,50},
        };

        int row = mat.length, col = mat[0].length;
        int k = 9;
        int foundrow = -1;

        int firstrow = 0, lastrow = row-1;

        while (firstrow <= lastrow){
            int midrow = (firstrow+lastrow) / 2;
            if (mat[midrow][0] <= k && mat[midrow][col-1] >= k){
                foundrow = midrow;
                break;
            }
            else if (k > mat[midrow][0]){
                firstrow = midrow + 1;
            }
            else {
                lastrow = midrow - 1;
            }
        }
        if (foundrow == -1){
            System.out.println("Not present");
            return;
        }
        int left = 0, right = col-1;

        while (left <= right){
            int mid = (left+right) / 2;
            if (mat[foundrow][mid] == k){
                System.out.println("present");
                return;
            }
            else if (k > mat[foundrow][mid]){
                left = mid+1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("not present");
    }
}