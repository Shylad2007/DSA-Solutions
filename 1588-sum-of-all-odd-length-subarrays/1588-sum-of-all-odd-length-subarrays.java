class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++) {
            prefix[i]=arr[i]+prefix[i-1];
        }

        int ans=prefix[arr.length-1];
        int x=3,l,r;

        while(x<=arr.length) {
            l=0;
            r=x-1;
            while(r<arr.length) {
                if(l==0) {
                    ans+=prefix[r];
                }
                else {
                    ans+=prefix[r]-prefix[l-1];
                }
                l++;
                r++;
            }
            x+=2;
        }

        return ans;
    }
}