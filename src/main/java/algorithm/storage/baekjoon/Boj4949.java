package algorithm.storage.baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String condition = br.readLine();
            if (condition.equals(".")) {
                break;
            }
            System.out.println(isYesOrNo(condition));
        }
    }

    private static String isYesOrNo(String condition) {
        String result;
        String pts = condition.replaceAll("[a-zA-Z\\s.]", "");
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < pts.length(); i++) {
            if(pts.charAt(i) == '(' || pts.charAt(i) == '[') {
                stack.push(pts.charAt(i));
            } else if (pts.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    result = "no";
                    return result;
                } else {
                    stack.pop();
                }
            } else {
                if(stack.isEmpty() || stack.peek() != '[') {
                    result = "no";
                    return result;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            result = "no";
            return result;
        }
        result = "yes";
        return result;
    }
}
