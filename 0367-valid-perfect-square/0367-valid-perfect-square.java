class Solution {
    public boolean isPerfectSquare(int num) {
    int id=num%10;
        if(id==2||id==3||id==7||id==8){
            return false;
        }
        int start=1;
        int end=num;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid>num){
                end=(int)mid-1;
            }else if(mid*mid<num){
                start=(int)mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}