import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        HashMap<Character,Integer> freq=new HashMap<>();

        for(String str:strs) {
            for(char ch:str.toCharArray()) {
                if(freq.containsKey(ch)) {
                    freq.put(ch,freq.get(ch)+1);
                }
                else {
                    freq.put(ch,1);
                }
            }

            StringBuilder temp=new StringBuilder();
            Character letters[]=freq.keySet().toArray(new Character[0]);
            Arrays.sort(letters);

            for(char ch:letters) {
                temp.append(ch);
                temp.append(freq.get(ch));
            }
            String t=temp.toString();

            if(map.containsKey(t)) {
                map.get(t).add(str);
            }
            else {
                map.put(t, new ArrayList<>());
                map.get(t).add(str);
            }
            freq.clear();
        }

        for(Map.Entry<String,ArrayList<String>> e:map.entrySet()) {
            ans.add(e.getValue());
        }

        return ans;
    }
}