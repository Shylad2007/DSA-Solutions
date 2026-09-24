class Solution {
    public int smallestIndex(int[] nums) {
        int temp;
        int idx=0;

        for(int i:nums) {
            temp=0;
            
            while(i!=0) {
                temp+=i%10;
                i/=10;
            }

            if(idx==temp)
                return idx;

            idx++;
        }
        return -1;
    }
}