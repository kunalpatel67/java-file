package Matrix;

public class p15_Delete_max_element_from_each_column {
    public static void main(String[] args) {
        int[][] mat = {
                {10,2,3},
                {40,50,6},
                {70,8,90},
                {100,11,12}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < col; i++){
            int maxindex = 0;
            for (int j = 0; j < row; j++){
                if (mat[j][i] > mat[maxindex][i]){
                    maxindex = j;
                }
            }
            for (int j = maxindex; j < row - 1; j++){
                mat[j][i] = mat[j+1][i];
            }
        }
        row--;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
