import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        int sum=0,ans=0,temp;

        for(int i:nums) {
            sum+=i;
            temp=Math.floorMod(sum,k);

            if(freq.containsKey(temp)) {
                ans+=freq.get(temp);
                freq.put(temp,freq.get(temp)+1);
            }
            else {
                freq.put(temp,1);
            }
        }

        return ans;
    }
}