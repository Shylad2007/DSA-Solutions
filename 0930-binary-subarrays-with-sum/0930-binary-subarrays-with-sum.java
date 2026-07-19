class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0,ans=0,temp;
        HashMap<Integer,Integer> pre=new HashMap<>();
        pre.put(0,1);

        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            temp=sum-goal;

            if(pre.containsKey(temp)) {
                ans+=pre.get(temp);
            }

            if(pre.containsKey(sum)) {
                pre.put(sum,pre.get(sum)+1);
            }
            else {
                pre.put(sum,1);
            }
        }

        return ans;
    }
}