class Solution {
    public int findDuplicate(int[] nums) {
        int max_idx=0;
        int curr_idx=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int id=nums[i]%n;
            nums[id]=nums[id]+n;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>curr_idx){
                curr_idx=nums[i];
                max_idx=i;
            }
            nums[i]=nums[i]%n;
        }
        return max_idx;
    }
}