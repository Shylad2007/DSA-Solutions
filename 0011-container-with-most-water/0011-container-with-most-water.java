class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int temp,ans=0;

        while(l<r) {
            temp=Math.min(height[l],height[r])*(r-l);
            ans=Math.max(ans,temp);

            if(height[l]<=height[r]) {
                l++;
            }
            else if(height[l]>height[r]) {
                r--;
            }
        }

        return ans;
    }
}