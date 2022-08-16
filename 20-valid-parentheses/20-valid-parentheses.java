class Solution {
    public boolean isValid(String s) {
    	if(s.length() % 2 != 0)
    		return false;
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		char currentBracket = s.charAt(i);
    	
    		if(currentBracket == '{')
    			stack.push('}');
    		else if(currentBracket == '(')
    			stack.push(')');
    		else if(currentBracket == '[')
    			stack.push(']');
    		else if(stack.isEmpty() || stack.pop() != currentBracket) {
    			return false;
    		}
    	}	
    	return stack.isEmpty();
    }
}