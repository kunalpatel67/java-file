package Matrix;

public class p20_Find_element_from_sorted_matrix_time_com_row_plus_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,5,8,10},
                {13,17,19,23},
                {27,30,35,38},
                {40,44,48,50},
        };

        int row = mat.length, col = mat[0].length;
        int k = 42;

        int left = 0, right = col-1;

        while (left < row && right >= 0){
            if (mat[left][right] == k){
                System.out.println("present");
                return;
            }
            else if (k > mat[left][right]){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
//time com:- row + column
