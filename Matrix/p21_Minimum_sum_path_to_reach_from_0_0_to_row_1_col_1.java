package Matrix;

public class p21_Minimum_sum_path_to_reach_from_0_0_to_row_1_col_1 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,0,4,5},
                {10,2,11,3},
                {7,8,0,2},
                {1,1,0,2},
        };
        int row = mat.length, col = mat[0].length;

        for (int i = 1; i < col; i++){
            mat[0][i] = mat[0][i] + mat[0][i-1];
        }
        for (int j = 1; j < row; j++){
            mat[j][0] = mat[j][0] + mat[j-1][0];
        }
        for (int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
                mat[i][j] = mat[i][j] + Math.min(mat[i][j-1], mat[i-1][j]);
            }
        }
        System.out.println(mat[row-1][col-1]);
    }
}
