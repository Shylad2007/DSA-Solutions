class Solution {
    public boolean isWithinThreshold(int[] nums, int divisor,int threshold) {
        int sum=0;
        for(int i:nums) {
            sum+=Math.ceil((double)i/divisor);

            if(sum>threshold)
                return false;
        }
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int start=1,end=0;
        for(int i:nums) {
            end=Math.max(end,i);
        }

        int ans=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;

            if(isWithinThreshold(nums,mid,threshold)) {
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
}