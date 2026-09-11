import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();

        int idx=0;
        for(int i=1;i<=n;i++) {
            if(idx==target.length)
                break;

            st.push(i);
            ans.add("Push");

            if(i==target[idx])
                idx++;
            else if(i!=target[idx]) {
                st.pop();
                ans.add("Pop");
            }
        }

        return ans;        
    }
}