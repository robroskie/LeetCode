/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let hashmap = new Map();
    for(let i = 0; i < nums.length; i++){
        hashmap.set(nums[i], i)
    }

    for(let i = 0; i < nums.length; i++){
        let search = target - nums[i];
        if(hashmap.has(search)){
            if(hashmap.get(search) > i){
                return [i, hashmap.get(search)];
            }
        }
    }

    return null;
};
