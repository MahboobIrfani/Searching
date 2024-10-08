class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int le=j+1;
                int ri=nums.length-1;
                while(le<ri){
                    long sum=(long) nums[i]+nums[j]+nums[le]+nums[ri];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[le]);
                        temp.add(nums[ri]);
                        ans.add(temp);
                        le++;
                        ri--;
                        while(le<ri && nums[le]==nums[le-1]){
                            le++;
                        }
                        while(le<ri && nums[ri]==nums[ri+1]){
                            ri--;
                        }
                    }else if(sum<target){
                        le++;
                    }else{
                        ri--;
                    }
                }
            }
        }
        return ans;
    }
}