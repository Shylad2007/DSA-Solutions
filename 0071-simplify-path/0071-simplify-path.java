import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        String a[]=path.split("/");
        Stack<String> st=new Stack<>();

        for(String s:a) {
            if(s.equals("."))
                continue;
            else if(s.equals("..")) {
                if(st.isEmpty())
                    continue;

                st.pop();
            }
            else {
                if(s.equals(""))
                    continue;
                else
                    st.push(s);
            }
        }

        if(st.isEmpty())
            return "/";

        StringBuilder sb=new StringBuilder();
        for(String i:st) {
            sb.append("/");
            sb.append(i);
        }

        return sb.toString();
    }
}