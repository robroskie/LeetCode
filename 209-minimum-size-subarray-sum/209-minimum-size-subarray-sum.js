/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {

    let sum = 0;
    let windowStart = 0;
    let min = nums.length + 1;

    // Iterate over the entire array(sliding window starts at index 0)
    for(let windowEnd = 0; windowEnd < nums.length; windowEnd++){
        console.log(`adding ${nums[windowEnd]}`)
        sum += nums[windowEnd];

        // While removing the first window element does not cause the sum to drop below the target, keep removing the first window element
        while(sum >= target){
            min = Math.min(windowEnd - windowStart + 1, min);
            console.log(`removing ${nums[windowStart]}`)
            sum -= nums[windowStart];
            windowStart++;

            console.log(`min=${min}`);
        }

  
    }



    if(min == nums.length + 1)
        return 0;
    return min;
};