class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,ans=Integer.MAX_VALUE,temp=0;

        for(int r=0;r<nums.length;r++) {
            temp+=nums[r];

            while(temp>target) {
                ans=Math.min(ans,r-l+1);
                temp-=nums[l++];
            }

            if(temp>=target) {
                ans=Math.min(ans,r-l+1);
            }
        }

        if(ans==Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }
}