class Solution {
    public boolean isValidSudoku(char[][] board) {
            	// Check if each row is ok

    	HashSet<Character> set = new HashSet<Character>();
    	
    	
 
    	for(int i = 0; i < board.length; i++) {
    		int left = 0;

    		set = new HashSet<Character>();
    		while(left < board[i].length) {
    			if(set.contains(board[i][left]))
    				return false;
    			else if(board[i][left] != '.') {
    				set.add(board[i][left]);
    	
    			}
    			left++;
    		
    			
    		}

    	}
    	
    	// Check if each column is ok
    	for(int i = 0; i < board.length; i++) {
    		int left = 0;

    		set = new HashSet<Character>();
    		while(left < board[i].length) {
    			if(set.contains(board[left][i]))
    				return false;
    			else if(board[left][i] != '.') {
    				set.add(board[left][i]);
    	
    			}
    			left++;
    		
    			
    		}
    	}
    	
    	//Check each of the 9 boxes
    	int left = 0;
    	int mid = 1;
    	int right = 2;
    	
    	for(int z = 0; z < 3; z++) {
            set = new HashSet<Character>();
        	for(int i = 0; i < 9; i++) {

        
        		if(set.contains(board[i][left]) || set.contains(board[i][mid]) || set.contains(board[i][right])) {
        			return false;
        		}
        		else {
   					if(board[i][left] != '.')
						set.add(board[i][left]);
					if(board[i][mid] != '.')
						set.add(board[i][mid]);
					if(board[i][right] != '.')
						set.add(board[i][right]);
        		}
      
        		
        		if(i == 2 || i == 5) {
            		set = new HashSet<Character>();
        		}
        		
        	}
        	left +=3;
        	mid +=3;
        	right +=3;
    	}
    	

    	
    	
    	return true;
    }
	
    }
