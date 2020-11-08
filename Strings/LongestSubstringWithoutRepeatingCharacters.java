class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] ch = s.toCharArray();
        int count=0,left=0,right=0,len=s.length();
        HashSet<Character> seen = new HashSet<>();
        
        while(left < len && right < len)
        {
            if(!seen.contains(ch[right]))
            {
                seen.add(ch[right++]);
                count = Math.max(count,right-left);
            }
            else
                seen.remove(ch[left++]);
        } 
        return count;
    }
}