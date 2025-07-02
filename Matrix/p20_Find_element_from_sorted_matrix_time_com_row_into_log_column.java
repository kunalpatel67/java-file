package Matrix;

public class p20_Find_element_from_sorted_matrix_time_com_row_into_log_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,5,8,10},
                {13,17,19,23},
                {27,30,35,38},
                {40,44,48,50},
        };

        int row = mat.length, col = mat[0].length;
        int k = 30;

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

// time com:- row*(log column)
