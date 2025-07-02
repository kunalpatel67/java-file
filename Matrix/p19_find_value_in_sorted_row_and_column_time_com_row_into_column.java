package Matrix;

public class p19_find_value_in_sorted_row_and_column_time_com_row_into_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5},
                {4,9,10},
                {7,12,16},
                {11,13,20},
        };

        int row = mat.length;
        int col = mat[0].length;
        int k = 20;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (mat[i][j] == k){
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}
// time com:- row * column
