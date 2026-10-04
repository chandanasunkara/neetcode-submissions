class Solution {
    public int maxArea(int[] heights) {
        int maxW = Integer.MIN_VALUE;
        int currentW = 0;

        for(int i = 0, j = heights.length - 1; i < j;) {
            currentW = calculateCurrentWater(heights, i, j);
            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
            maxW = Math.max(maxW, currentW);
        }
        return maxW;
    }

    public int calculateCurrentWater(int[] h, int i, int j) {
        return Math.min(h[i], h[j]) * (j - i);
    }
}
