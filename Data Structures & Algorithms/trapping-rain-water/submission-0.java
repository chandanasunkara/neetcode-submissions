class Solution {
    public int trap(int[] height) {
        if(height.length < 3) {
            return 0;
        }

        int i = 0;
        while(height[i] == 0) {
            i++;
        }

        int j = height.length - 1;
        while(height[j] == 0) {
            j--;
        }
        
        int totalW = 0;
        int lM = 0;
        int rM = 0;
        int l = i, r = j;
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
