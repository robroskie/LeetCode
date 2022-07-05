class Solution {
    public int totalFruit(int[] fruits) {
    	int startWindow = 0;
    	
    	int maxFruit = 0;
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int endWindow = 0; endWindow < fruits.length; endWindow++) {
    		map.merge(fruits[endWindow], 1, Integer::sum);
    		
    		while(map.size() > 2) {
    			map.put(fruits[startWindow], map.get(fruits[startWindow]) - 1);
    		
    			if(map.get(fruits[startWindow]) == 0) {
    				map.remove(fruits[startWindow]);
    			}
    			startWindow++;
    		}
    		maxFruit = Math.max(maxFruit, endWindow - startWindow + 1);
    	}
    	return maxFruit;
    }
}