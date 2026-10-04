class Solution {
    public int getSum(int a, int b) {
        int carry;
        while(b != 0) {
            carry = (a & b) << 1;
            a = a ^ b; // sum
            b = carry;
        }
        return a;
    }
}
