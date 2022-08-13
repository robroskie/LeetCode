class Solution {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
    	for(int i = 0; i < s.length(); i++) {
    		map.put(s.charAt(i), i);
    	}
    	
    	List<Integer> result = new ArrayList<>();  	
    	int max = 0;
    	int previous = -1;
  
    	for(int i  = 0; i < s.length(); i++) {
    		max = Math.max(map.get(s.charAt(i)), max);
    		
    		if(i == max) {
    			result.add(max - previous);
    			previous = max;
    		}
    	}
    	return result;
    }
}