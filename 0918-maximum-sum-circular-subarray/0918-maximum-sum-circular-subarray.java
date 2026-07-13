class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxCurrSum=0;
        int totalsum=0;
        int min=Integer.MAX_VALUE;
        int minCurrSum=0;

        for(int i:nums) {
            totalsum+=i;
            maxCurrSum+=i;
            minCurrSum+=i;

            min=Math.min(minCurrSum,min);
            max=Math.max(maxCurrSum,max);

            if(maxCurrSum<0) {
                maxCurrSum=0;
            }

            if(minCurrSum>0) {
                minCurrSum=0;
            }
        }

        if(max<0) {
            return max;
        }
        return Math.max(totalsum-min,max);
    }
}