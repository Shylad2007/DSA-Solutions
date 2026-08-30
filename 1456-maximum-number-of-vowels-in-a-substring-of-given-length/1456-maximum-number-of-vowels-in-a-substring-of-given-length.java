import java.util.*;

class Solution {
    public boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    
    public int maxVowels(String s, int k) {   
        int l=0,ans=-1,count=0;

        for(int r=0;r<s.length();r++) {
            if(isVowel(s.charAt(r)))
                count++;

            if(r-l+1==k) {
                ans=Math.max(ans,count);

                if(isVowel(s.charAt(l)))
                    count--;

                l++;
            }
        }
        return ans;   
    }
}