class Solution {
    
    public boolean isAnagram(String s, String t) {
        
        int[] frq = new int[26];
        for(char ch:s.toCharArray())
            frq[ch-'a']++;
        
        for(char ch:t.toCharArray())
            frq[ch-'a']--;
        
        for(int cnt:frq){
            if(cnt!=0)
                return false;
        }
        
        return true;
    }
}