import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "(()";
        String test3 = "(())";
        
        System.out.println(test1 + " is valid: " + isValid(test1));
        System.out.println(test2 + " is valid: " + isValid(test2));
        System.out.println(test3 + " is valid: " + isValid(test3));
    }
}
