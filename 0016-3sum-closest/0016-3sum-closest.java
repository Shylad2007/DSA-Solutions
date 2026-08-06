class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int i,j,k;

        for(i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            j=i+1;
            k=nums.length-1;

            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) {
                    return sum;
                }
                else if(Math.abs(sum-target)<=Math.abs(ans-target)) {
                    ans=sum;
                }

                if(sum>target) {
                    k--;
                }
                else if(sum<target) {
                    j++;
                }
            }
        }

        return ans;
    }
}