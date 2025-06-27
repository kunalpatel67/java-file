package Matrix;

public class p6_Print_mirror_image_of_matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < row; i++){
            for (int j = col-1; j >= 0; j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
