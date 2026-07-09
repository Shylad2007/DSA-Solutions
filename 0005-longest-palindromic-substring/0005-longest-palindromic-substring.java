class Solution {
    public static String expand(String s, int l, int r) {
        while(l>=0 && r<s.length()) {
            if(s.charAt(l)!=s.charAt(r)) {
                break;
            }
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        String ans="";

        for(int i=0;i<s.length();i++) {
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);

            if(odd.length()>even.length() && ans.length()<odd.length()) {
                ans=odd;
            }
            else if(odd.length()<even.length() && ans.length()<even.length()) {
                ans=even;
            }
        }

        return ans;
    }
}