class Solution {
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

            int l=0,tempm=m,tempk=k;
            for(int r=0;r<bloomDay.length;r++) {
                if((r-l+1)>tempk) {
                    l=r;
                }

                if(bloomDay[r]<=mid && (r-l+1)==tempk) {
                    tempm--;
                }
                else if(bloomDay[r]>mid) {
                    l=r+1;
                }
            }

            if(tempm>0) {
                start=mid+1;
            }
            else {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}