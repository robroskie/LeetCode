/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    let curr;

    while(right > left){
        curr = numbers[left] + numbers[right];
        // console.log(`curr = ${curr}      target=${target}`);
        if(curr == target){
            return [left + 1, right + 1]
        }
        if(curr > target){
            right -= 1;
        }    
        else{
            left += 1;
        }
        
    }

    return -1;
};