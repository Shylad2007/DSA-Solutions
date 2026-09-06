import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums=new Stack<>();
        Stack<String> alphabets=new Stack<>();

        StringBuilder ans=new StringBuilder();
        int num=0;

        for(char ch:s.toCharArray()) {
            if(Character.isDigit(ch))
                num=num*10+(ch-'0');
            else if(ch=='[') {
                nums.push(num);
                num=0;

                alphabets.push(ans.toString());
                ans.setLength(0);
            } else if(ch==']') {
                int n=nums.pop();
                String prev=alphabets.pop();

                StringBuilder temp=new StringBuilder();

                for(int i=1;i<=n;i++)
                    temp.append(ans);

                ans=new StringBuilder(prev+temp);
            } else
                ans.append(ch);
        }

        return ans.toString();
    }
}