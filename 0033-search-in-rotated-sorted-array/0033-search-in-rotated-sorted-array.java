class Solution {
    public int bs(int[] nums, int start, int end, int target) {
        while(start<=end) {
            int mid=start+(end-start)/2;

            if(nums[mid]>target) {
                end=mid-1;
            }
            else if(nums[mid]<target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1,pivot=0;

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>nums[i+1]) {
                pivot=i+1;
            }
        }
        
        int pass1=bs(nums,start,pivot,target);
        int pass2=bs(nums,pivot,end,target);

        if(pass1==-1 && pass2==-1)
            return -1;
        else if(pass1!=-1)
            return pass1;
        else
            return pass2;
    }
}