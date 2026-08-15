class Solution {
    public boolean bouquetPossible(int[] nums, int day, int m, int k) {
        int l=0;
        for(int r=0;r<nums.length;r++) {
            if((r-l+1)>k) {
                l=r;
            }

            if(nums[r]<=day && (r-l+1)==k) {
                m--;
            }
            else if(nums[r]>day) {
                l=r+1;
            }
        }

        if(m>0)
            return false;
        else
            return true; 
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int start=Integer.MAX_VALUE,end=Integer.MIN_VALUE,ans=-1;

        if(bloomDay.length<m*k)
            return -1;

        for(int i:bloomDay) {
            start=Math.min(start,i);
            end=Math.max(end,i);
        }

        while(start<=end) {
            int mid=start+(end-start)/2;

            if(bouquetPossible(bloomDay, mid, m, k)) {
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