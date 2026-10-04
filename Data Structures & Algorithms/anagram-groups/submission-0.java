class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();

        if(strs.length == 1) {
            return List.of(List.of(strs));
        }

        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String s : strs) {
            String sortedStr = sortStr(s);

            List<String> anagramList;

            if( ! anagramsMap.containsKey(sortedStr)) {
                anagramList = new ArrayList<>();
                anagramList.add(s);
                anagramsMap.put(sortedStr, anagramList);
            } else {
                anagramList = anagramsMap.get(sortedStr);
                anagramList.add(s);
                anagramsMap.put(sortedStr, anagramList);
            }
        }

        for(List<String> anagramList : anagramsMap.values()) {
            groupAnagrams.add(anagramList);
        }

        return groupAnagrams;
    }

    public String sortStr(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
}
