class Solution {
    public int reverse(int x) {
        int revN = 0;
        int digit;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while(x != 0) {
            System.out.println(revN);
            digit = x % 10;

            if((revN > (max / 10)) || (revN < (min / 10))) {
                return 0;
            } else if((revN == (max / 10)) && (digit > max % 10)) {
                return 0;
            } else if((revN == (min / 10)) && (digit < min % 10)) {
                return 0;
            }

            revN = (revN * 10) + digit;
            x = x / 10;
        }
        return revN;
    }
}
