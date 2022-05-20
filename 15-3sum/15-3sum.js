/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let toReturn = [];

    nums.sort((a, b) => a - b);
    for(let i = 0; i < nums.length; i++){
        if(i > 0){
            while(nums[i] == nums[i - 1] && i < nums.length)
                i++;
        }
        let l = i + 1;
        let r = nums.length - 1;

        while(l < r){
            let sum = nums[i] + nums[l] + nums[r];

            if(sum == 0){
                toReturn.push([nums[i], nums[l], nums[r]]);
                let previous = l;
                l++;
                while(nums[l] == nums[previous])
                    l++;
                r = nums.length - 1;
            }
            else if(sum > 0)
                r -= 1;
            else
                l += 1;
            if(l >= nums.length)
                break;
        }
    }
    return toReturn;
};