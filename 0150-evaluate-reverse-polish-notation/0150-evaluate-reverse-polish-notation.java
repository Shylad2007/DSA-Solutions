import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(String s:tokens) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int a=stack.pop();
                int b=stack.pop();

                int c=0;
                
                if(s.equals("+")) c=b+a;
                else if(s.equals("-")) c=b-a;
                else if(s.equals("*")) c=b*a;
                else if(s.equals("/")) c=b/a;

                stack.push(c);
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();
    }
}