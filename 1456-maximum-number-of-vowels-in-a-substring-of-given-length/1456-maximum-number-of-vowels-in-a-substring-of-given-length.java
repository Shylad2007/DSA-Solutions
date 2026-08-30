import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>(Set.of('a','e','i','o','u'));
        
        int l=0,ans=-1,count=0;
        
        for(int r=0;r<s.length();r++) {
            if(set.contains(s.charAt(r)))
                count++;

            if(r-l+1==k) {
                ans=Math.max(ans,count);

                if(set.contains(s.charAt(l)))
                    count--;

                l++;
            }
        }
        return ans;   
    }
}