class Solution {
    public int myAtoi(String s) {
        int ans=0;
        s=s.trim();
        char ch[]=s.toCharArray();
        boolean isNegative=false;

        for(int i=0;i<ch.length;i++) {
            if(i==0 && ch[i]=='-') {
                isNegative=true;
                continue;
            }
            else if(i==0 && ch[i]=='+') {
                continue;
            }

            if(!Character.isDigit(ch[i])) {
                break;
            }

            if(ans>Integer.MAX_VALUE/10) {
                if(isNegative)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            else if(ans==Integer.MAX_VALUE/10) {
                if(ch[i]-'0'>7) {
                    if(isNegative)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }
            }
            
            ans=ans*10+(ch[i]-'0');
        }

        if(isNegative) 
            return ans*-1;
        else
            return ans;
    }
}