class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxP = Integer.MIN_VALUE;
        int minP = 1;
        for(int i = 0; i <piles.length; i++) {
            maxP = Math.max(maxP, piles[i]);
            minP = Math.min(minP, piles[i]);
        }

        int k = Integer.MAX_VALUE;
        int mid;
        while(minP <= maxP) {
            mid = (maxP + minP) / 2;
            if( h < getHours(piles, mid)) {
                minP = mid + 1;
            } else {
                maxP = mid - 1;
                k = Math.min(k, mid);
            }
        }

        return k;
    }

    public int getHours(int[] pile, int mid) {
        int hours = 0;
        for(int i = 0; i < pile.length; i++) {
            hours += Math.ceil(pile[i] / (mid * 1.0));
        }
        return hours;
    }
}
