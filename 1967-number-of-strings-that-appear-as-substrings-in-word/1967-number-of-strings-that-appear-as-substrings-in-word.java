class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;

        for(String pattern:patterns) {
            if(word.indexOf(pattern)!=-1) {
                ans+=1;
            }
        }

        return ans;
    }
}