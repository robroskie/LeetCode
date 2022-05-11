/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let max = Math.max(...nums);
    let cMin = 1;
    let cMax = 1;
    
    for(let e in nums){
        let value = nums[e];

        let tempcMax = cMax;

        cMax = Math.max(value, cMax * value, cMin * value);
        cMin = Math.min(value, tempcMax * value, cMin * value);

        max = Math.max(cMin, cMax, max);      
    }

    return max;
};