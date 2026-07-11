class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1=0,p2=0,i=0,j=0;

        while(p1<word1.length && p2<word2.length) {
            if(word1[p1].charAt(i)!=word2[p2].charAt(j)) {
                return false;
            }

            i++;
            j++;

            if(i==word1[p1].length()) {
                i=0;
                p1++;
            }

            if(j==word2[p2].length()) {
                j=0;
                p2++;
            }
        }

        if(p1==word1.length && p2==word2.length) {
            return true;
        }
        return false;
    }
}