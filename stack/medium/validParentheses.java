
import java.util.Stack;

public class validParentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && c == ')') || (s.peek() == '{' && c == '}') || (s.peek() == '[' && c == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true; 
        }else {
            return false;
        }
    }

    public static boolean duplicateParentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            //closing

            if(c == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1) return true;else{
                    s.pop();
                }
            }else{
                s.push(c);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(})[]]";
        System.out.println(isValid(str));
        String str2 = "((a+b))";
        System.out.println(duplicateParentheses(str2));
    }
}
