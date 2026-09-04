import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()) {
            if(ch=='*') {
                if(stack.isEmpty())
                    continue;
                else
                    stack.pop();
            }
            else
                stack.push(ch);
        }

        StringBuilder temp=new StringBuilder();
        for(char ch:stack)
            temp.append(ch);

        return temp.toString();
    }
}