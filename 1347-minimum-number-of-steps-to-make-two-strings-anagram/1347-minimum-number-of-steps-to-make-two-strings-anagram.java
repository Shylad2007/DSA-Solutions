class Solution {
    public int minSteps(String s, String t) {
        int map[]=new int[26];
        int ans=0;

        for(char ch:s.toCharArray()) {
            map[ch-'a']++;
        }

        for(char ch:t.toCharArray()) {
            map[ch-'a']--;
        }

        for(int i:map) {
            if(i>0)
                ans+=i;
        }

        return ans;
    }
}