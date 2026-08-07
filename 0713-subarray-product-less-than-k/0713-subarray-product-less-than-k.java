class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,count=0,product=1;

        for(int r=0;r<nums.length;r++) {
            product*=nums[r];

            while(product>=k) {
                product/=nums[l];
                l++;

                if(l>=nums.length) {
                    return count; 
                }
            }
            count+=(r-l+1);
        }

        return count;
    }
}