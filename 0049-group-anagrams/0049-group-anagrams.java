import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        
        for(String str:strs) {
            int freq[]=new int[26];

            for(char ch:str.toCharArray()) {
                freq[ch-'a']+=1;
            }

            StringBuilder temp=new StringBuilder();
            for(int i=0;i<26;i++) {
                if(freq[i]!=0) {
                    temp.append('a'+i);
                    temp.append(freq[i]);
                }
                
            }
            String t=temp.toString();

            if(map.containsKey(t)) {
                map.get(t).add(str);
            }
            else {
                map.put(t, new ArrayList<>());
                map.get(t).add(str);
            }
        }

        for(Map.Entry<String,ArrayList<String>> e:map.entrySet()) {
            ans.add(e.getValue());
        }

        return ans;
    }
}