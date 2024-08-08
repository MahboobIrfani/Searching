class Solution {
    public int countNegatives(int[][] grid) {
       // int r=0;
        //int c=grid.length-1;
     /*   int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0)
                count++;
            }
        }
        return count;*/
       int rows= grid.length;
        int cols=grid[0].length;
        int count=0;
        int last=cols-1;
        for(int i=0;i<rows;i++){
            if(grid[i][0]<0){
                count=count+cols;
                continue;
            }
            if(grid[i][cols-1]>0){
                continue;
            }
            int start=0;
            int end=last;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]<0){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            count=count+(cols-start);
            last=start;
        }
        return count;
        }
    }
