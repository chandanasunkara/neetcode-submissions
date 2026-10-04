class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_list = []

        for ch in s:
            char_list.append(ch)
        
        for ch in t:
            if ch not in char_list:
                return False;
            char_list.remove(ch)
        
        return char_list == []