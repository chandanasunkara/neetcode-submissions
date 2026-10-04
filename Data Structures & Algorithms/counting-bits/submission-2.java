class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            count[i] = get1sCount(i);
        }
        return count;
    }

    public int get1sCount(int n) {
        int count = 0;
        for(int i = 0; i <= 10; i++) {
            if((( n >> i ) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}
