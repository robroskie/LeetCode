/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {

    
    if(prices.length <= 1)
        return 0;
    
    let left = prices[0];
    let right = prices[1];
    
    let MP = Math.max(0, right - left);

    for(let i = 1; i < prices.length - 1; i++){
        // if new low is found update the left and right pointer accordingly 
        if(prices[i] < left)    
            left = prices[i];
            right = prices[i+1];
        // if a new high is found, update the right pointer accordingly
        if(prices[i+1] > right)
            right = prices[i + 1]; 
        
        MP = Math.max(MP, right - left);
        
    }
    return MP;
};

