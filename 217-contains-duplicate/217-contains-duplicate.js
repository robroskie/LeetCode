/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    //  If the length of the set from the array is less than the length of the
    //  original array, then there is at least one duplicate
        const temp = new Set(nums);
        if(temp.size < nums.length)
            return true;
        return false;
};
    

