class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) {
            return s.length();
        }

        Set<Character> chSet = new HashSet<>();
        char[] chArr = s.toCharArray();
        int subStrLen = 1;

        int i = 0;

        for(int j = 0; j < s.length(); j++) {
            while(chSet.contains(chArr[j])) {
                chSet.remove(chArr[i]);
                i++;
            }
            chSet.add(chArr[j]);
            subStrLen = Math.max(subStrLen, j - i + 1);
        }
        return subStrLen;
    }
}
