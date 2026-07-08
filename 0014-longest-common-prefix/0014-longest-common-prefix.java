class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix=new StringBuilder();

        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++) {
            min=Math.min(min,strs[i].length());
        }

        for(int i=0;i<min;i++) {
            char ch=strs[0].charAt(i);
            boolean isPrefix=true;

            for(int j=1;j<strs.length;j++) {
                if(ch!=strs[j].charAt(i)) {
                    isPrefix=false;
                    break;
                }    
            }

            if(isPrefix) {
                prefix.append(ch);
            }
            else {
                break;
            }
        }

        return prefix.toString();
    }
}