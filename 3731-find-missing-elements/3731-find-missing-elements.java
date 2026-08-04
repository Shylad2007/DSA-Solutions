import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i:nums) {
            min=Math.min(min,i);
            max=Math.max(max,i);
            set.add(i);
        }

        for(int i=min;i<=max;i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}