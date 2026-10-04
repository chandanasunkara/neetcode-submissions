class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> threeSumSet = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1, k = nums.length - 1; j < k;) {
                if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else if(nums[i] == -(nums[j] + nums[k])) {
                    threeSumSet.add(List.of(nums[i], nums[j], -nums[i] - nums[j]));
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(threeSumSet);
    }
}
