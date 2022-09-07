class Solution {
    public boolean isValid(String s) {
    	if(s.length() % 2 != 0)
    		return false;
    	
    	Stack<Character> st = new Stack<>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		char current_bracket = s.charAt(i);
    		if(current_bracket == '{') 
    			st.push('}');
    		else if(current_bracket == '(')
    			st.push(')');
    		else if(current_bracket == '[')
    			st.push(']');		
    		else if(st.isEmpty() || st.pop() != current_bracket)
				return false;

    	}
        return st.isEmpty();
    }
}