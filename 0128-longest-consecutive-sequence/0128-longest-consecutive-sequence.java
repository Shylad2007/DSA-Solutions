import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i:nums) {
            set.add(i);
        }

        for(int i:set) {
            int len=0;
            if(set.contains(i+1)) {
                continue;
            }
            else {
                while(set.contains(i)) {
                    len++;
                    i--;
                }
                ans=Math.max(len,ans);
            }
        }

        return ans;
    }
}