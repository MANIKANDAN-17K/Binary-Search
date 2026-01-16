class Solution {
    public int arrangeCoins(int n) {
        long m = (long)n;
        return (sqrt(8*m+1)-1)/2;   
    }
    private int sqrt(long n){
        long l = 0,h = n;
        while(l<=h){
            long m = l + (h - l)/2;
            if(m == n/m) return (int) m;
            else if(m < n/m) l = m+1;
            else h = m - 1;
        }
        return (int) h;
    }
}
