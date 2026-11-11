class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //String means : key i.e. aet 
        //List<String> means: Value->["eat","tea","ate"]
        HashMap<String, List<String>> res =new HashMap<>();
        for(int i=0;i<strs.length;i++) {
             String s = strs[i];
        //freq count 
        int freq[] = new int[26];
        for(int j=0;j<s.length();j++) {
                freq[s.charAt(j)-'a']++;
            }
        StringBuilder key =new StringBuilder();
        for(int j=0;j<26;j++){
            key.append(freq[j]).append('#');
        }
        String k =key.toString();
        if(!res.containsKey(k)){
            res.put(k,new ArrayList<>());
        }
        res.get(k).add(s);
        }
        return new ArrayList<>(res.values());
    }
}