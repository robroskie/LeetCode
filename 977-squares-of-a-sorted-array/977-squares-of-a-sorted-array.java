class Solution {
    public int[] sortedSquares(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		int[] toReturn = new int[nums.length];
		
		int idx = nums.length - 1;
		
		while(left <= right) {
			if(Math.pow(nums[left], 2) < Math.pow(nums[right], 2)) {
				toReturn[idx] = (int)Math.pow(nums[right], 2);
				right--;
			}
			else {
				toReturn[idx] = (int)Math.pow(nums[left], 2);
				left++;
			}
			idx--;
		}
		return toReturn;
    }
}