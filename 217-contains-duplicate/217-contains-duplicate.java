class Solution {
    public boolean containsDuplicate(int[] nums) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for(int i = 0; i < nums.length; i++){
	        map.merge(nums[i],1,Integer::sum);
	    }
	    System.out.println(map);
	    for(int element : map.keySet()) {
	    	if(map.get(element) > 1)
	    		return true;
	    }
	    return false;
	}
}
