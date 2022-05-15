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
        console.log(`left=${left} (${nums[left]}) mid=${mid} (${nums[mid]}) right=${right} (${nums[right]})`);

        // Middle equal to or greater than left
        if(nums[mid] >= nums[left]){
            // Search right
            if(target < nums[mid] && target >= nums[left]){
                right = mid - 1;
            }
            // Search left
            else{
                left = mid + 1;
            }
        }
        // Middle less than left 
        else{
            if(target > nums[mid] && target <= nums[right]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        console.log(`left=${left} mid=${mid} right=${right}\n`);
    }
    while(left <= right)

    return -1;

};
