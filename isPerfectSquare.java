class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num;
        while(s<=e){
            int m= s + (e - s)/2;
            long sq = (long) m * (long) m;
            if(sq < num){
                s = m + 1;
            }else if(sq > num){
                e = m - 1;
            }else return true;
        }
        return false;
    }
}
