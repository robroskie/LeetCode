class Solution {
    public boolean isAnagram(String s, String t) {
//    	not same length
    	if(s.length() != t.length())
    		return false;
    	
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        
//       build hashmap for s
        for(int i = 0; i < s.length(); i++) {
        	mapS.merge(s.charAt(i), 1, Integer::sum);
        }
//      build hashmap for t
        for(int i = 0; i< t.length(); i++) {
        	mapT.merge(t.charAt(i), 1, Integer::sum);
        }
        
        System.out.println(mapS);
        System.out.println(mapT);
        
//      check if hashmaps match (if they don't for any value, return false
        return mapS.equals(mapT);
 
    }
}