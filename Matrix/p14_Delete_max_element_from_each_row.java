package Matrix;

public class p14_Delete_max_element_from_each_row {
    public static void main(String[] args) {
        int[][] mat = {
                {10,2,3},
                {40,50,6},
                {70,8,90},
                {100,11,12}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < row; i++){
            int maxindex = 0;
            for (int j = 1; j < col; j++){
                if (mat[i][j] > mat[i][maxindex]){
                    maxindex = j;
                }
            }
            for (int j = maxindex; j < col - 1; j++){
                mat[i][j] = mat[i][j+1];
            }
        }
        col--;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
