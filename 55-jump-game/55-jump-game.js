/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    // Set the starting element to the last index of the array
    let currentIdx = goalPostIdx = nums.length - 1;    
    currentIdx--;

    while(0 <= currentIdx){
        console.log(`goalPostIdx=${goalPostIdx}, currentIdx=${currentIdx}`);
        if((goalPostIdx - currentIdx) <= nums[currentIdx]){
            goalPostIdx = currentIdx;
        }
        currentIdx--;
    }

    if(goalPostIdx == 0){
        return true;
    }
    return false;
};