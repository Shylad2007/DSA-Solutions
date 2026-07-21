import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0,temp,ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                sum+=1;
            }
            else {
                sum-=1;
            }

            temp=0-sum;

            if(map.containsKey(temp)) {
                ans=Math.max(ans,i-map.get(temp));
            }
            else {
                map.put(temp,i);
            }
        }           
        return ans;
    }
}