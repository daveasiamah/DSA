import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackUtilsV2 {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch))
                if (stack.empty()) return false;
            var top = stack.pop();
            if (bracketsMatch(top, ch)) return false;

        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        var leftBrackets = Arrays.asList('(', '<', '[', '{');
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        ArrayList<Character> rightBrackets = new ArrayList<Character>();
        return ch == ')' || ch == ']' || ch == '>' || ch == '}';
    }

    private boolean bracketsMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == '>' && left != '<') ||
                (right == ']') && (left != '[') ||
                (right == '}') && (left != '{');
    }
}