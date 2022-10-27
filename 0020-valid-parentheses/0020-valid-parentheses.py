class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 1 or len(s) % 2 != 0:
            return False

        stack = []

        for i in s:
            if i == '(':
                stack.append(')')
            elif i == '[':
                stack.append(']')
            elif i == '{':
                stack.append('}')
            elif len(stack) == 0:
                return False
            elif i != stack.pop():
                return False
    
        if(len(stack) > 0):
            return False
        
        return True