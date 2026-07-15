class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefix[]=new long[nums.length];
        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++) {
            prefix[i]=nums[i]+prefix[i-1];
        }

        int ways=0;
        long lsum,rsum;
        for(int i=0;i<nums.length-1;i++) {
            lsum=prefix[i];
            rsum=prefix[nums.length-1]-lsum;

            if(lsum>=rsum) {
                ways++;
            }
        }

        return ways;
    }
}