class Solution {
    public void findIslands(char[][] matrix, int row, int col){
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || matrix[row][col] == '0'){
            return;
        }
           
        matrix[row][col] = '0';
        
        
        findIslands(matrix, row + 1, col);
        findIslands(matrix, row - 1, col);
        findIslands(matrix, row, col + 1);
        findIslands(matrix, row, col - 1);
    }
    
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == '1'){
                    numIslands++;
                    findIslands(grid, row, col);
                }
            }
        }
        
        return numIslands;
    }
}