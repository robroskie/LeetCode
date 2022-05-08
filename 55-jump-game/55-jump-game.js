/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let currentIdx = goalPostIdx = nums.length - 1;    
    currentIdx--;

    while(0 <= currentIdx){
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