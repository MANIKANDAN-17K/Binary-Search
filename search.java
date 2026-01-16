class Solution {
    public int search(int[] nums, int target) {
        int l = 0,h = nums.length - 1,a = -1;
        while(l <= h){
            int m = l + (h - l)/2;
            if(nums[m] == target){
                a= m;
                h = m -1;
            }
            else if( nums[m] > target){
                h = m - 1;
            }else{
                l = m + 1;
            }
        }
        return a;
    }
}
