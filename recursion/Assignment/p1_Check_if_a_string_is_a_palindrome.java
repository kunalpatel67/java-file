package recursion.Assignment;

public class p1_Check_if_a_string_is_a_palindrome {
    public static void main(String[] args) {
        String s = "noon";
        int left = 0, right = s.length()-1;
        boolean ans = isPelin(s,left,right);
        System.out.println(ans);
    }
    public static boolean isPelin(String s,int left, int right){
        if (left >= right){
            return true;
        }
        if (s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPelin(s,left+1,right-1);
    }
}
