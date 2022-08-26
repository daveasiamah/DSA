import java.util.Stack;

public class StackUtils {
    public boolean isBalanced(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            if(isLeftBracket(ch))
                stack.push(ch);
            if(isRightBracket(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if(bracketsMatch(top, ch)) return false;
            }
                stack.pop();
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return ch == '(' || ch == '[';
    }

    private boolean isRightBracket(char ch){
        return ch == ')' || ch == ']';
    }

    private boolean bracketsMatch(char left, char right){
        return (right == ')' && left != '(')||
                (right == '>' && left != '<') ||
                (right == ']') && (left != '[') ||
                (right == '}') && (left != '{') ;
    }
}
