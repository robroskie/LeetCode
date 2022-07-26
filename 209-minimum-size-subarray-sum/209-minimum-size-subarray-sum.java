class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    	int left = 0;
    	int min = nums.length + 1;
    	int sum = 0;
    	
    	for(int right = 0; right < nums.length; right++) {
    		sum += nums[right];
    		
    		while(sum >= target) {
    			min = Math.min(right - left + 1, min);
    			sum -= nums[left];
    			left++;
    		}
    	}
    	if(min == nums.length + 1)
            return 0;
    	return min;
    	
    }
}