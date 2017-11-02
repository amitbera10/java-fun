import java.util.Stack;

/**
 * Created by amit on 29/9/17.
 */
public class BraketsCheck {
    public static void main(String[] args) {
        String s = "{hdfghjd6}{{hjfhj}888}";
        Stack<String> stack = new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='{'){
                stack.push(String.valueOf(ch));
            }else if (ch=='}'){
                if (stack.pop().equals('}')){
                   continue;
                }else {
                    break;
                }
            }
        }
    }
}
