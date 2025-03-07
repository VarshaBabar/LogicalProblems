// Valid Parentheses : 
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input 
// string is valid. 
import java.util.*;
public class Parentheses {
    public static boolean isParentheses(String s){
        Stack<Character> st = new Stack<>(); 
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }else if(ch == '}' && st.peek() == '{'){
                    st.pop();
                } else if(ch == ']' && st.peek() == '['){
                    st.pop();
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isParentheses(s));;
    }
}
