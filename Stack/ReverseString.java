import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("Sarang"));
    }

    public char[] reverseString(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = stack.pop();
        }
        return chars;
    }

}
