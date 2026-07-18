class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0,temp;
        int pre[]=new int[nums.length];
        if(nums[0]==k)
            ans++;
        pre[0]=nums[0];

        for(int i=1;i<nums.length;i++) {
            pre[i]=pre[i-1]+nums[i];
            if(nums[i]==k)
                ans++;
        }

        for(int l=0;l<nums.length-1;l++) {
            for(int r=l+1;r<nums.length;r++) {
                if(l==0)
                    temp=pre[r];
                else
                    temp=pre[r]-pre[l-1];

                if(temp==k)
                    ans++;
            }
        }

        return ans;
    }
}