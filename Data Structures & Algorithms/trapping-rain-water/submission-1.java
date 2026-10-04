class Solution {
    public int trap(int[] height) {
        if(height.length < 3) {
            return 0;
        }
        
        int totalW = 0;
        int lM = 0, rM = 0;
        int l = 0, r = height.length - 1;

        while(l < r) {
            if(height[l] < height[r]) {
                if(lM < height[l]) {
                    lM = height[l];
                } else {
                    totalW += lM - height[l];
                }
                l++;
            } else {
                if(rM < height[r]) {
                    rM = height[r];
                } else {
                    totalW += rM - height[r];
                }
                r--;
            }
        }

        return totalW;
    }
}
