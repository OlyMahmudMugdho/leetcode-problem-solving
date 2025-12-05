class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characterCount = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
            characterCount[t.charAt(i) - 'a']--;
        }

        for (int count : characterCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}