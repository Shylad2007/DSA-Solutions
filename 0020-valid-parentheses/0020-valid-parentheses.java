import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
        
            if(ch==')') {
                if(stack.peek()=='(') {
                    stack.pop();
                    continue;
                }
            }
            else if(ch=='}') {
                if(stack.peek()=='{') {
                    stack.pop();
                    continue;
                }
            }
            else if(ch==']') {
                if(stack.peek()=='[') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        return stack.isEmpty();
    }
}