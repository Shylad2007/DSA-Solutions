import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans=new ArrayList<>();
        int i,j,k;

        for(i=0;i<nums.length-2;i++) {
            if(nums[i]>0)
                break;
            
            j=i+1;
            k=nums.length-1;

            if(i>0 && nums[i]==nums[i-1])
                continue;

            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                
                if(sum<0) {
                    j++;
                }
                else if(sum>0) {
                    k--;
                }
                else {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1])
                        j++;

                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }
            }
        }
        return ans;
    }
}