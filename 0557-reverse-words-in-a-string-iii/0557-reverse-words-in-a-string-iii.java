class Solution {
    public String reverseWords(String s) {
        String s_arr[]=s.split(" ");
        StringBuilder ans=new StringBuilder();
        char temp;

        for(int i=0;i<s_arr.length;i++) {
            char ch[]=s_arr[i].toCharArray();
            int l=0,r=ch.length-1;

            while(l<r) {
                temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;

                l++;
                r--;
            }
            
            ans.append(String.valueOf(ch));
            if(i!=s_arr.length-1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}