class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowLow = 0;
        int rowHigh = m - 1;
        int rowMid = (m - 1 ) / 2;

        while(rowLow <= rowHigh) {
            rowMid = (rowLow + rowHigh) / 2;
            if(target > matrix[rowMid][n - 1]) {
                rowLow = rowMid + 1;
            } else if(target < matrix[rowMid][0]) {
                rowHigh = rowMid - 1;
            } else {
                break;
            }
        }

        int l = 0;
        int r = n - 1;
        int mid;

        while(l <= r) {
            mid = (l + r) / 2;
            if(target > matrix[rowMid][mid]) {
                l = mid + 1;
            } else if(target < matrix[rowMid][mid]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
