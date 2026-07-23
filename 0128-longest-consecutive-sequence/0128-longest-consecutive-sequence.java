import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }

        int ans=0,temp;
        for(int i:set) {
            temp=1;
            if(set.contains(i-1)) {
                continue;
            }
            else {
                while(set.contains(i+1)) {
                    temp++;
                    i++;
                }
                ans=Math.max(ans,temp);
            }
        }        

        return ans;
    }
}