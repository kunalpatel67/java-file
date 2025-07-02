package Matrix;

public class p20_Find_element_from_sorted_matrix_time_com_row_into_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,5,8,10},
                {13,17,19,23},
                {27,30,35,38},
                {40,44,48,50},
        };

        int row = mat.length, col = mat[0].length;
        int k = 23;

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
// time com = row*column