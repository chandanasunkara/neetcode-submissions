class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer> keysList = new ArrayList<>(freqMap.keySet());

        keysList.sort((a, b) -> Integer.compare(freqMap.get(b), freqMap.get(a)));

        int[] topKFreqArr = new int[k];
        for(int i = 0; i < k; i++) {
            topKFreqArr[i] = keysList.get(i);
        }
        
        return topKFreqArr;
    }
}
