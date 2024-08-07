class Solution {
    public int arrangeCoins(int n) {
      /*  int i=1;
        while(n>=i){
            n=n-i;
            i++;
        }
        return i-1;*/
        long start=0;
        long end=n;
        while(start<=end){
            long mid= start+(end-start)/2;
            if(mid*(mid+1)/2==n){
                return (int)mid;
            }else if(mid*(mid+1)/2>n){
                end=(int)mid-1;
            }else{
                start=(int)mid+1;
            }
        }
        return (int)end;
    }
}