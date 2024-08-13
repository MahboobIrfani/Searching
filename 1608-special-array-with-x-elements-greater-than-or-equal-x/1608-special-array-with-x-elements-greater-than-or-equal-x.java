class Solution {
    public int specialArray(int[] nums) {
       int n= nums.length;
        int[] count=new int[n+1];
        for(int a:nums){
            if(a>=n){
                count[n]++;
            }else{
                count[a]++;
            }
        }
        int res=0;
        for(int i=count.length-1;i>=0;i--){
            res=res+count[i];
            if(res==i){
                return i;
            }
        }
        return -1;
    }
}
