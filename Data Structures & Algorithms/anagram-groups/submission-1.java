class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1) {
            return List.of(List.of(strs));
        }

        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String s : strs) {
            String charCount = getCharCount(s);
            List<String> anagramList;

            if( ! anagramsMap.containsKey(charCount)) {
                anagramList = new ArrayList<>();
                anagramList.add(s);
                anagramsMap.put(charCount, anagramList);
            } else {
                anagramList = anagramsMap.get(charCount);
                anagramList.add(s);
                anagramsMap.put(charCount, anagramList);
            }
        }

        
        List<List<String>> groupAnagrams = new ArrayList<>();
        for(List<String> anagramList : anagramsMap.values()) {
            groupAnagrams.add(anagramList);
        }

        return groupAnagrams;
    }

    public String getCharCount(String s) {
        int[] charCount = new int[26];
        for(char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        return Arrays.toString(charCount);
    }
}
