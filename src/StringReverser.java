import java.util.Stack;

public class StringReverser {
    public static String reverse(String input) {
        if (input == null || input.length() == 0) {
            return "Not valid string";
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        var result = StringReverser.reverse("protected");
        System.out.println(result);
    }
}