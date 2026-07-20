import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> fre=new HashMap<>();

        if(s.length()!=t.length()) {
            return false;
        }

        for(char ch:s.toCharArray()) {
            if(fre.containsKey(ch)) {
                fre.put(ch,fre.get(ch)+1);
            }
            else {
                fre.put(ch,1);
            }
        }

        for(char ch:t.toCharArray()) {
            if(fre.containsKey(ch)) {
                fre.put(ch,fre.get(ch)-1);
            }
            else {
                return false;
            }

            if(fre.get(ch)==0) {
                fre.remove(ch);
            }
        }

        if(fre.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}