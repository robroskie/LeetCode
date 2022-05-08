/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    // Set to the sum of the subarray with the highest sum
    let max = nums[0];
    // Reset to 0 if becomes negative 
    let sum = 0;
    
    // Iterate over nums from left to right 
    for (const element of nums){
        // If the sum is less than 0, reset it
        if(sum < 0){
            sum = 0;
        }
        // Add the previous cumulative sum to the current element
        // Take the max of the two values
        sum += element;
        max = Math.max(max, sum);
    }
    return max; 
};