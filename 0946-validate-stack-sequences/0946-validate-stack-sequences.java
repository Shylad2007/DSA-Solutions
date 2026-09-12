import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();

        int i=0,j=0;

        while(i!=pushed.length && j!=popped.length) {
            if(st.isEmpty()) {
                st.push(pushed[i]);
                i++;
                continue;
            }
            
            if(pushed[i]==popped[j]) {
                i++;
                j++;
            }
            else if(popped[j]==st.peek()) {
                st.pop();
                j++;
            }
            else {
                st.push(pushed[i]);
                i++;
            }
        }

        if(i!=pushed.length)
            return false;

        while(!st.isEmpty() && j!=popped.length) {
            if(st.peek()!=popped[j])
                return false;
            else {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}