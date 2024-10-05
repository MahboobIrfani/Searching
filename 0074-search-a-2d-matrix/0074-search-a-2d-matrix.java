class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        // run the loop till 2 rows are left
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return true;
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        // Searchh in 1st half
        if(target<=matrix[rStart][cMid]){
            return binarySearch(matrix,rStart,0,cMid,target);
        }
        if(target>=matrix[rStart][cMid] && target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid,cols-1,target);
        }
        if(target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix,rStart+1,0,cMid,target);
        }
        return binarySearch(matrix,rStart+1,cMid,cols-1,target);
    }
    public static boolean binarySearch(int[][] nums,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(nums[row][mid]==target){
                return true;
            }
            else if(nums[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return false;
    }
}