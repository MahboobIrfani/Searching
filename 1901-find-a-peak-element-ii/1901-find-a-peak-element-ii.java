class Solution {
    public int[] findPeakGrid(int[][] mat) {
        if(mat.length==1 && mat[0].length==1){
            return new int[]{0,0};
        }
        if(mat.length==1){
            int max=0;
            for(int i=0;i<mat[0].length;i++){
                if(mat[0][i]>mat[0][max]){
                    max=i;
                }
            }
            return new int[]{0,max};
        }
        int rowStart=0;
        int rowEnd=mat.length-1;
        while(rowStart<=rowEnd){
            int midRow=rowStart+(rowEnd-rowStart)/2;
            int rowMax=maxindex(mat[midRow]);
            try{
                if(midRow==0){
                    if(mat[midRow][rowMax]>mat[midRow+1][rowMax]){
                        return new int[]{midRow,rowMax};
                    }
                }
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(midRow==mat.length-1){
                if(mat[midRow][rowMax]>mat[midRow-1][rowMax])
                {
                    return new int[]{midRow,rowMax};
                }
             }  
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(mat[midRow][rowMax]>mat[midRow-1][rowMax] && mat[midRow][rowMax]>mat[midRow+1][rowMax]){
                    return new int[]{midRow,rowMax};
                }
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(mat[midRow][rowMax]<mat[midRow+1][rowMax]){
                    rowStart=midRow+1;
                }else{
                    rowEnd=midRow-1;
                }
            }catch(ArrayIndexOutOfBoundsException e){}

        }
                    return new int[]{-1,-1};
    }
    public static int maxindex(int[] nums){
        int max=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}