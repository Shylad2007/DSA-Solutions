class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1map[]=new int[26];
        int s2map[]=new int[26];
        boolean ans;

        for(char ch:s1.toCharArray()) {
            s1map[ch-'a']++;
        }

        int l=0,r;

        for(r=0;r<s2.length();r++) {
            ans=true;
            s2map[s2.charAt(r)-'a']++;

            if((r-l+1)>s1.length()) {
                s2map[s2.charAt(l)-'a']--;
                l++;
            }
            
            for(int i=0;i<26;i++) {
                if(s1map[i]!=s2map[i]) {
                    ans=false;
                    break;
                }
            }

            if(ans) {
                return true;
            }
        }

        return false;
    }
}