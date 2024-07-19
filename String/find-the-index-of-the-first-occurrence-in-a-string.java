class Solution {

    public int strStr(String haystack, String needle) {
        
        // Edge case: if needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        // Edge case: if needle is longer than haystack, return -1
        if (needleLength > haystackLength) {
            return -1;
        }
        
        // Iterate through the haystack
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring of haystack starting from index i matches needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        
        // If needle was not found, return -1
        return -1;

    }
}
