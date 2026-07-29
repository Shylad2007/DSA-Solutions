import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int a[]=new int[26];

        for(char ch:p.toCharArray()) {
            a[ch-'a']++;
        }

        for(int i=0;i<s.length()-p.length()+1;i++) {
            boolean isAna=true;
            int b[]=new int[26];
            String sub=s.substring(i,i+p.length());

            for(char ch:sub.toCharArray()) {
                b[ch-'a']++;
            }

            for(int j=0;j<26;j++) {
                if(a[j]!=b[j])
                    isAna=false;
            }

            if(isAna)
                ans.add(i);
        }

        return ans;
    }
}