class Solution {
    public int compress(char[] chars) {
        int idx=0,i;

        for(i=0;i<chars.length;) {
            char ch=chars[i];
            int count=0;

            while(i<chars.length && ch==chars[i]) {
                i++;
                count++;
            }

            chars[idx++]=ch;

            if(count>1) {
                if(count>9) {
                    char digits[]=Integer.toString(count).toCharArray();
                    for(char x:digits) {
                        chars[idx++]=x;
                    }
                }
                else {
                    chars[idx++]=(char)(count+'0');
                }
            }
        }
        return idx;
    }
}