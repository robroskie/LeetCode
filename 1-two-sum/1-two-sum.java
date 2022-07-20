class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] toReturn = new int[2];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++) {
			int searchVal = target - nums[i];
			
			if(map.containsKey(searchVal)) {
				toReturn = new int[] {map.get(searchVal), i};
				return toReturn;
			}
			map.put(nums[i], i);
		}
		return toReturn;
	}
}