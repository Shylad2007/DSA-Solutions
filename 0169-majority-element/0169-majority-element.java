class Solution {
    public int majorityElement(int[] nums) {
        int ans=0,vote=0;

        for(int i:nums) {
            if(vote==0) {
                ans=i;
            }

            if(ans==i) {
                vote++;
            }
            else {
                vote--;
            }
        }

        return ans;
    }
}