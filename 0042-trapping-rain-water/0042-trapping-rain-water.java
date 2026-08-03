class Solution {
    public int trap(int[] height) {
        int lmax=height[0],rmax=height[height.length-1];
        int l=1,r=height.length-2;
        int ans=0;

        while(l<=r) { 
            lmax=Math.max(height[l],lmax);
            rmax=Math.max(height[r],rmax);

            if(lmax<rmax) {
                ans+=lmax-height[l];
                l++;
            }
            else {
                ans+=rmax-height[r];
                r--;
            }
        }

        return ans;
    }
}