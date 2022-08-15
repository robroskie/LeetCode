class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		int[] toReturn = new int[k];

//		Create Hashmap where keys are the numbers and values are the counts
		Map<Integer, Integer> map = new HashMap<>();
		
//		Add the key value pairs to the hashmap - O(N) time
		for(int curNum : nums) {
			map.merge(curNum, 1, Integer::sum);
		}
	
		PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
		for(int currentNumber : map.keySet()) {
			pQueue.add(currentNumber);
		}
		
		for(int i = 0; i < k; i++) {
			toReturn[i] = pQueue.poll();
		}
		
		return toReturn;

	}
}