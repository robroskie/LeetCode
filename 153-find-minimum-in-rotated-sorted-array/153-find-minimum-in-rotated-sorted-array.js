/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let min = nums[0];
    let left = 0;
    let right = nums.length - 1;

    let mid = Math.floor(nums.length / 2);

    do
    {
        min = Math.min(min, nums[mid]);

        if(nums[mid] > nums[right]){
            left = mid; 
            let temp = mid;
            mid = Math.ceil((right - left) / 2) + temp;
        }
        else{
            // console.log('searching left');
            right = mid;
            mid = Math.ceil((right - left) / 2);
        }
        min = Math.min(min, nums[mid]);
    }
    while(right - left > 1)
        
    return min;    
};