/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    let sum = 0;
    let windowStart = 0;
    let min = nums.length + 1;

    for(let windowEnd = 0; windowEnd < nums.length; windowEnd++){
        sum += nums[windowEnd];

        while(sum >= target){
            min = Math.min(windowEnd - windowStart + 1, min);
            sum -= nums[windowStart];
            windowStart++;
        }
    }
    if(min == nums.length + 1)
        return 0;
    return min;
};