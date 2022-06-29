class Solution {
    public static int totalFruit(int[] fruits) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int startWindow = 0;
    	int max = 0;
    	for(int endWindow = 0; endWindow < fruits.length; endWindow++) {
    		int key = fruits[endWindow];
    		map.merge(key, 1, Integer::sum);
    		while(map.size() > 2) {
    			int keyToRemove = fruits[startWindow];
    			map.put(keyToRemove, map.get(keyToRemove) - 1);
    			if(map.get(keyToRemove) == 0) {
    				map.remove(keyToRemove);
    			}
    			startWindow++;
    		}
    		max = Math.max(max, endWindow - startWindow + 1);
    	}
    	return max;
    }
}