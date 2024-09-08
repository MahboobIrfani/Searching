class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int start=1;
        int end=maxvalue(piles);
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossilblehoure(piles,mid,h)){
                ans =mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
         return ans;
    }
    public static boolean isPossilblehoure(int[] nums,int speed,int hour){
        int hourspent=0;
        for(int i=0;i<nums.length;i++){
        hourspent+=nums[i]/speed;   
        if(nums[i]%speed!=0){
            hourspent+=1;
        }
             if(hourspent>hour){
            return false;
        }
    }
       
        return true;
    }
    public static int maxvalue(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}