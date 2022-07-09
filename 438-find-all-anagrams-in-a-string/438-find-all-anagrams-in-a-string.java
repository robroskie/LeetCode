class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> angrmIdx = new ArrayList<>();
    	
    	Map<Character, Integer> sMap = new HashMap<>();
    	Map<Character, Integer> pMap = new HashMap<>();
    	
    	for(int i = 0; i < p.length(); i++) {
     		pMap.merge(p.charAt(i), 1, Integer::sum);
    	}
    	
    	System.out.println(pMap + "\n");
    	
    	int startWindow = 0;
    	
    	for(int endWindow = 0; endWindow < s.length(); endWindow++) {
    		char key = s.charAt(endWindow);
    		
    		sMap.merge(key, 1, Integer::sum);
    		
    		if(endWindow - startWindow >= p.length()) {
    			char keyStart = s.charAt(startWindow);
    			sMap.put(keyStart, sMap.get(keyStart) - 1);
    			if(sMap.get(keyStart) == 0)
    				sMap.remove(keyStart);
    			startWindow++;
    		}
    		if(sMap.equals(pMap)) {
    			angrmIdx.add(startWindow);
    		}
    	}
    	return angrmIdx;
    }
}