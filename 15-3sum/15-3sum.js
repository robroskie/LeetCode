/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let toReturn = [];
    // sort the array to be parsed
    nums.sort((a, b) => a - b);

    for(let i = 0; i < nums.length; i++){

        // prevent duplicates from being found and added to return list
        if(i > 0){
            while(nums[i] == nums[i - 1] && i < nums.length){
                i++;
            }
        }

        // initalize left and right pointers
        let l = i + 1;
        let r = nums.length - 1;
        
        // while left pointer is left of the right
        while(l < r){
            // calculate the sum
            let sum = nums[i] + nums[l] + nums[r];

            // if sum equal to 0
            // push the corresponding three values

            if(sum == 0){
                console.log('pushing above value');
    
                toReturn.push([nums[i], nums[l], nums[r]]);

                // move the left pointer until a new value is encountered(since we only want to use each combination once)
                let previous = l;
                l++;
                while(nums[l] == nums[previous]){
                    l++;
                }
                



                // reset right pointer to the end of the array so that new combinations can be considered with the updated left pointer
                r = nums.length - 1;

                
   

            }
            // if sum is greater than the target value, move the right pointer 1 to the left
            else if(sum > 0){
                r -= 1;
            }
            // by elimination the sum has to be less than the target value, move the left pointer 1 to the right
            else{
                l += 1;
            }
            if(l >= nums.length)
                break;

        }
    }
    return toReturn;
};