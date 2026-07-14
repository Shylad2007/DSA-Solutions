class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        char nums[]={'1','2','3','4','5','6','7','8','9'};
        int diff=1;
        int l,r,x;

        for(int i=1;i<10;i++) {
            l=0;
            r=i;
            while(r<10) {
                x=0;
                for(int j=l;j<r;j++) {
                    x=x*10+(nums[j]-'0');
                }
                
                if(x<=high && x>=low) {
                    ans.add(x);
                }
                l++;
                r++;
            }
        }

        return ans;
    }
}