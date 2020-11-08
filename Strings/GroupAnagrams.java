class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> anagrams = new HashMap();
        
        for(String str : strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            
            if(!anagrams.containsKey(s))
                anagrams.put(s,new ArrayList<>());
            
            anagrams.get(s).add(str);
        }
        
      return new ArrayList(anagrams.values());
        
    }
}