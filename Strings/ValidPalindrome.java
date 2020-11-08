class Solution {
    
    public boolean isPalindrome(String s) {
       
        if(s.length() == 0)
            return true;
    
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        
        int left=0,right=ch.length-1;
        
        while(left < right)
        {
            
            if(!Character.isLetterOrDigit(ch[left]))
                left++;
            
            else if(!Character.isLetterOrDigit(ch[right]))
                right--;
            
            else
            {
                if(ch[left]!=ch[right])
                    return false;
                else
                {
                    left++;
                    right--;
                }
            }
        }
        
        return true;
    }
}