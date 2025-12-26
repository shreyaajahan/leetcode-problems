class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int start = 0;
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(count)) {
                if (count == 0) start = i;
                count++;
                if (count == needle.length()) {
                    return start;
                }
            } else {
                i = i - count;
                count = 0;
            }
        }
        return -1;
    }
}
