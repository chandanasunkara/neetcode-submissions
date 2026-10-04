class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high) {
            mid = (low + high) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]) {
                low++;
            } else if(target < nums[mid]) {
                high--;
            }
        }
        return -1;
    }
}
