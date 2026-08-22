class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1;
        int org=n;

        while(n!=0) {
            sum+=n%10;
            product*=n%10;
            n/=10;
        }

        if(org%(sum+product)==0)
            return true;
        else
            return false;
    }
}