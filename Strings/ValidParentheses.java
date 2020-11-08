class Solution {
    public boolean isValid(String s) {
        
        char[] str = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(char ch : str) {
            if(ch == '(')
                st.push(')');
            
            else if(ch == '{')
                st.push('}');
            
            else if(ch == '[')
                st.push(']');
            
            else if( st.isEmpty() || st.pop() != ch) 
                 return false;
        }
        
       return st.isEmpty();

    }
}