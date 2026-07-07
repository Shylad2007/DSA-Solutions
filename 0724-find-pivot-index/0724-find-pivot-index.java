class Solution {
    public int pivotIndex(int[] nums) {
        int suml=0,sumr=0;

        for(int num:nums) {
            sumr+=num;
        }

        for(int i=0;i<nums.length;i++) {
            sumr-=nums[i];
            if(suml==sumr) {
                return i;
            }

            suml+=nums[i];
        }

        return -1;
    }
}