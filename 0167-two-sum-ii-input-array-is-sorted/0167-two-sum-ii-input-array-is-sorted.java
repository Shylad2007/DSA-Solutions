class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int i=1,j=numbers.length;

        while(i<j) {
            if(numbers[i-1]+numbers[j-1]==target) {
                ans[0]=i;
                ans[1]=j;
                return ans;
            }

            if(numbers[i-1]+numbers[j-1]>target) {
                j--;
            }
            else if(numbers[i-1]+numbers[j-1]<target) {
                i++;
            }
        }

        return ans;
    }
}