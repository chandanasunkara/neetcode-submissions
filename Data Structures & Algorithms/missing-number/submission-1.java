class Solution {
    public int missingNumber(int[] nums) {
        int missingNum = 0;
        for(int i = 1; i <= nums.length; i++) {
            missingNum ^= i;
        }
        for(int i = 0; i < nums.length; i++) {
            missingNum ^= nums[i];
        }
        return missingNum;
    }
}
