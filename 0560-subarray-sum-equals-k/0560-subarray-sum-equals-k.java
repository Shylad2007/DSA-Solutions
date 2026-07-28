import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0,temp;

        for(int i:nums) {
            sum+=i;
            temp=sum-k;

            if(map.containsKey(temp)) {
                ans+=map.get(temp);
            }

            if(map.containsKey(sum)) {
                map.put(sum,map.get(sum)+1);
            }
            else {
                map.put(sum,1);
            }
        }

        return ans;
    }
}