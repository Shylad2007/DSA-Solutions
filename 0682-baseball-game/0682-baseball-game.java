import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();

        for(String s:operations) {
            if(s.equals("C")) stack.pop();
            else if(s.equals("D")) stack.push(stack.peek()*2);
            else if(s.equals("+")) {
                int a=stack.pop();
                int b=stack.pop();
                int c=a+b;

                stack.push(b);
                stack.push(a);
                stack.push(c);
            }
            else stack.push(Integer.parseInt(s));
        }

        int ans=0;
        for(int i:stack)
            ans+=i;

        return ans;
    }
}