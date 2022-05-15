/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let left = 0;
    let right = nums.length - 1;
    let mid; 

    do{
        mid = Math.floor((right + left) / 2);
        if(nums[mid] == target)
            return mid;

        if(nums[mid] >= nums[left]){
            if(target < nums[mid] && target >= nums[left])
                right = mid - 1;
            else
                left = mid + 1;
        }
        else{
            if(target > nums[mid] && target <= nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
    while(left <= right)
    return -1;
};
