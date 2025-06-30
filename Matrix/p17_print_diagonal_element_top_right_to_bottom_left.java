package Matrix;

public class p17_print_diagonal_element_top_right_to_bottom_left {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        int row = mat.length , col = mat[0].length;
        for (int i = 0; i < row; i++){
            System.out.println(mat[i][row-1-i]);
        }
    }
}
