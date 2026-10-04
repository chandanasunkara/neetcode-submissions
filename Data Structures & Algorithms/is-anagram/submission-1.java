class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> charList = new ArrayList<>();

        for (Character ch : s.toCharArray()) {
            charList.add(ch);
        }

        for (Character ch : t.toCharArray()) {
            if (!charList.contains(ch)) {
                return false;
            }
            charList.remove(ch);
        }

        return charList.size() == 0;
    }
}
