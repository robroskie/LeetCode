/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let min = nums[0];
    let left = 0;
    let right = nums.length - 1;

    let mid = Math.floor(nums.length / 2);
    // console.log(mid);
    // console.log(`left=${nums[left]}, mid=${nums[mid]}, right=${nums[right]}`);
    // Search right
    do
    {
        // console.log('vvvvvvvvvvvv');
        // console.log(`min before=${min}`)
        min = Math.min(min, nums[mid]);
        // console.log(`min after=${min}`)

        if(nums[mid] > nums[right]){
            // console.log('searching right');
            left = mid; 
            let temp = mid;
            mid = Math.ceil((right - left) / 2) + temp;
        }
        else{
            // console.log('searching left');
            right = mid;
            mid = Math.ceil((right - left) / 2);
        }
    
        // console.log('mid: ' + mid);
        // console.log(`left=${nums[left]}, mid=${nums[mid]}, right=${nums[right]}`);
    
        // console.log('^^^^^^^^^^');
        min = Math.min(min, nums[mid]);
    }
    while(right - left > 1)
        
    return min;    
};