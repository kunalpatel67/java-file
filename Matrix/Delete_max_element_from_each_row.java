package Matrix;

public class Delete_max_element_from_each_row {
    public static void main(String[] args) {
        int[][] mat = {
                {1,20,30},
                {40,5,60},
                {7,8,90},
                {10,110,120}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < row; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < col; j++){
                if (mat[i][j] > max){
                    max = mat[i][j];
                }
            }
            for (int j = 0; j < col; j++){
                if (mat[i][j] == max){
                    continue;
                }
                else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
