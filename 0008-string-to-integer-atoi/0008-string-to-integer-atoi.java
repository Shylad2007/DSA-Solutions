class Solution {
    public int myAtoi(String s) {
        int ans=0;
        boolean isNegative=false;

        s=s.trim();
        if(s.length()==0) {
            return 0;
        }
        char digits[]=s.toCharArray();

        if(digits[0]=='-') {
            isNegative=true;
        }

        for(int i=0;i<digits.length;i++) {
            if(i==0 && (digits[0]=='-' || digits[0]=='+')) {
                continue;
            }

            if(Character.isDigit(digits[i])) {
                if(ans>Integer.MAX_VALUE/10) {
                    if(isNegative)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }
                else if(ans==Integer.MAX_VALUE/10) {
                    if(digits[i]-'0'>7) {
                        if(isNegative)
                            return Integer.MIN_VALUE;
                        else
                            return Integer.MAX_VALUE;
                    }
                }
                ans=ans*10+(digits[i]-'0');
            }
            else {
                break;
            }
        }
        
        if(isNegative) {
            return ans*-1;
        }
        else {
            return ans;
        }
    }
}