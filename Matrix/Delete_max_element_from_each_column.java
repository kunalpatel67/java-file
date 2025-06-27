package Matrix;

public class Delete_max_element_from_each_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,20,30},
                {40,5,60},
                {7,8,90},
                {10,110,120}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < col; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++){
                if (mat[j][i] > max){
                    max = mat[j][i];
                }
            }
            for (int j = 0; j < row; j++){
                if (mat[j][i] == max){
                    continue;
                }
                else {
                    System.out.print(mat[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
