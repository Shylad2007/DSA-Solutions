class Solution {
    public long sumAndMultiply(int n) {
        long tempo=0;

        while(n!=0) {
            long temp=n%10;
            if(temp!=0) {
                tempo=tempo*10+temp;
            }
            n/=10;
        }

        long x=0;
        long sum=0;

        while(tempo!=0) {
            long temp=tempo%10;
            x=x*10+temp;
            tempo/=10;
            sum+=temp;
        }

        return x*sum;
    }
}