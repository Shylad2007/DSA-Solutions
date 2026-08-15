class Solution {
    public boolean isWithinDays(int[] weights, int capacity, int days) {
        int sum=0,currdays=1;
        
        for(int i:weights) {
            if(sum+i>capacity) {
                currdays++;
                sum=i;
            }
            else {
                sum+=i;
            }

            if(currdays>days)
                return false;
        }

        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start=0,end=0,ans=-1;

        for(int i:weights) {
            start=Math.max(start,i);
            end+=i;
        }

        while(start<=end) {
            int mid=start+(end-start)/2;

            if(isWithinDays(weights,mid,days)) {
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