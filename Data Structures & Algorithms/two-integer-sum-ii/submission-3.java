class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        int n1, n2;
        for(int i = 0, j = numbers.length - 1; i < j;) {
            while(numbers[i] + numbers[j] > target) {
                j--;
            }
            while(numbers[i] + numbers[j] < target) {
                i++;
            }
            if(numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{0, 1};
    }
}
