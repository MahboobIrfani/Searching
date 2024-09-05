class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] first=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            hm.put(intervals[i][0],i);
            first[i]=intervals[i][0];
        }
        Arrays.sort(first);
        int ans[]=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int key=binarySearch(first,intervals[i][1]);
            if(key==first.length){
                ans[i]=-1;
            }
            else if(key==0){
                if(intervals[i][1]<=first[0]){
                    ans[i]=hm.get(first[key]);
                }else{
                    ans[i]=-1;
                }
            }else{
                ans[i]=hm.get(first[key]);
            }
        }
        return ans;
    }
    public static int binarySearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}