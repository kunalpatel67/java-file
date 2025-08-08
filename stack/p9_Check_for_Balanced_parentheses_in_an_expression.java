package stack;

import java.util.Stack;

public class p9_Check_for_Balanced_parentheses_in_an_expression {
    public static void main(String[] args) {
        String s = "[({})]";
        System.out.println(isBalanced(s));
    }
    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }

            else if (ch == ']' || ch == ')' || ch == '}'){
                if (stack.isEmpty()) {
                    return false;
                }

                char lastCh = stack.pop();

                if (    (ch == ')' && lastCh != '(') ||
                        (ch == '}' && lastCh != '{') ||
                        (ch == ']' && lastCh != '[')){
                    return false;
                }
            }
        }
        return true;
    }
}
