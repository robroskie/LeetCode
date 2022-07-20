class Solution {
    public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++) {
			int searchVal = target - nums[i];
			
			if(map.containsKey(searchVal)) {
				return new int[] {map.get(searchVal), i};
			}
			
			map.put(nums[i], i);
		}
		
		System.out.println(map);

		
		return new int[] {69, 96};
	}

}