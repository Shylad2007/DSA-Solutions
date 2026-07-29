import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int pmap[]=new int[26];
        int smap[]=new int[26];

        if(s.length()<p.length()) {
            return ans;
        }

        for(char ch:p.toCharArray()) {
            pmap[ch-'a']++;
        }

        for(int i=0;i<p.length();i++) {
            smap[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length()-p.length()+1;i++) {
            boolean isAna=true;
            for(int j=0;j<26;j++) {
                if(pmap[j]!=smap[j]) {
                    isAna=false;
                    break;
                }
            }

            if(isAna)
                ans.add(i);

            if(i+p.length()!=s.length()) {
                smap[s.charAt(i)-'a']--;
                smap[s.charAt(i+p.length())-'a']++;
            }
        }

        return ans;
    }
}