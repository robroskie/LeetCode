/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    let map = {};

    for(let i = 0; i < nums.length; i++){
        map[nums[i]] = i;
    }

    for(let i = 0; i < nums.length; i++){
        let val = target - nums[i];
        if(map[val] != i && val in map){
            return[i, map[val]];
        }
    }
};