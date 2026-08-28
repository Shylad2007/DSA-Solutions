import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:friends)
            set.add(i);
            
        int ans[]=new int[friends.length];

        int idx=0;
        for(int i:order) {
            if(set.contains(i)) {
                ans[idx]=i;
                idx++;
            }
        }

        return ans;
    }
}