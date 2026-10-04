class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        int n1, n2;
        for(int i = 0; i < numbers.length; i++) {
            
            n1 = numbers[i];
            n2 = target - n1;

            if(hashMap.containsKey(n2)) {
                return new int[]{hashMap.get(n2) + 1, i + 1};
            }

            hashMap.put(n1, i);
        }
        
        return new int[]{0, 1};
    }
}
