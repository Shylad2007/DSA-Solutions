class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++) {
            int temp=1;
            int a=i;
            while(a!=0) {
                temp*=a%10;
                a/=10;
            }

            if(temp%t==0)
                return i; 
        }

        return -1;
    }
}