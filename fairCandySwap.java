class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = 0,bSum = 0;
        Arrays.sort(bobSizes);
        for(int i : aliceSizes) aSum += i;
        for(int i : bobSizes) bSum += i;
        int half = (bSum - aSum) / 2;
        for(int i : aliceSizes){
            int temp = hasBox(bobSizes,half + i);
            if(temp != -1){
                return new int[]{i,bobSizes[temp]};
            }
        }
        return new int[] {0,0};
    }
    int hasBox(int[] a,int b){
        int l = 0,r = a.length -1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(a[m] == b){
                return m;
            }else if(a[m] < b){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }
}
