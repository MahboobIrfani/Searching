class Solution {
    public int countNegatives(int[][] grid) {
       // int r=0;
        //int c=grid.length-1;
        int start=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0)
                start++;
            }
        }
        return start;
        }
    }
