class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i <= 31; i++) {
            count += ( n >> i ) & 1;
        }
        return count;
    }
}
        // while( n > 0 ) {
        //     if(n % 2 == 1) {
        //         count++;
        //     }
        //     n /=2;
        // }
        // return count;