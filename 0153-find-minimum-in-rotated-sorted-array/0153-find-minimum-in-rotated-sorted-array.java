class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;

        int start=0,end=nums.length-1;

        while(start<=end) {
            int mid=start+(end-start)/2;
            min=Math.min(min,nums[mid]);

            if(nums[start]<nums[mid]) {
                if(nums[mid]>nums[end]) {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else {
                if(nums[mid]<nums[start]) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }

        return min;
    }
}