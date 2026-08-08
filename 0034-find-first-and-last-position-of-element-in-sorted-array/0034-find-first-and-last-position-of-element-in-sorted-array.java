class Solution {
    public int binarySearch(int[] nums, int target, boolean firstOcc) {
        int start=0,end=nums.length-1,ans=-1;

        while(start<=end) {
            int mid=start+(end-start)/2;

            if(nums[mid]<target) {
                start=mid+1;
            }
            else if(nums[mid]>target) {
                end=mid-1;
            }
            else {
                ans=mid;
                if(firstOcc)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};

        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);

        return ans;
    }
}