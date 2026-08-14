class Solution {
    public long canFinish(int[] piles, int speed) {
        long time=0;

        for(int i:piles) {
            time+=(int)Math.ceil((double)i/speed);
        }
        return time;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        int ans=0;

        for(int i:piles) {
            high=Math.max(high, i);
        }

        while(low<=high) {
            int mid=low+(high-low)/2;
            long htaken=canFinish(piles,mid);

            if(htaken<=h) {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}