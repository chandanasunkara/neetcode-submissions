class Solution {
    public int trap(int[] height) {
        if(height.length < 3) {
            return 0;
        }
        
        // int totalW = 0;
        // int lM = 0, rM = 0;
        // int l = 0, r = height.length - 1;

        // while(l < r) {
        //     if(height[l] < height[r]) {
        //         if(lM < height[l]) {
        //             lM = height[l];
        //         } else {
        //             totalW += lM - height[l];
        //         }
        //         l++;
        //     } else {
        //         if(rM < height[r]) {
        //             rM = height[r];
        //         } else {
        //             totalW += rM - height[r];
        //         }
        //         r--;
        //     }
        // }

        // return totalW;


        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int totalW = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            totalW += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalW;
    }
}
