class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sumA=0;
        int sumB=0;
        for(int i=0;i<aliceSizes.length;i++){
            sumA=sumA+aliceSizes[i];
        }
        Set<Integer> setB= new HashSet<>();
         for(int i=0;i<bobSizes.length;i++){
            sumB=sumB+bobSizes[i];
             setB.add(bobSizes[i]);
        }
        int diff=(sumB-sumA)/2;
         for(int i=0;i<aliceSizes.length;i++){
            if(setB.contains(aliceSizes[i]+diff)){
                return new int[]{aliceSizes[i],aliceSizes[i]+diff};
            }
        }
        return new int[]{-1,-1};
    }
}