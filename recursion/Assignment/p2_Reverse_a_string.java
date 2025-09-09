package recursion.Assignment;

public class p2_Reverse_a_string {
    public static void main(String[] args) {
        String s = "hello";
        int len = s.length();
        rev(s,len-1);
    }
    public static void rev(String s,int index){
        if (index == -1){
            return;
        }
        System.out.print(s.charAt(index));
        rev(s,index-1);
    }
}
