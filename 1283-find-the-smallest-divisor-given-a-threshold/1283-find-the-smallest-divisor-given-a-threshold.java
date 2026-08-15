class Solution {
    public int arrayDividedSum(int[] nums, int divisor) {
        int sum=0;
        for(int i:nums) {
            sum+=Math.ceil((double)i/divisor);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int orgsum=arrayDividedSum(nums,1);

        int start=1,end=orgsum;
        int ans=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            int temp=arrayDividedSum(nums,mid);

            if(temp<=threshold) {
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