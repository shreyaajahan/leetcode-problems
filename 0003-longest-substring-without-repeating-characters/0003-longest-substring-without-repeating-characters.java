class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0; 
        int maxLen = Math.min(s.length(),1);

        Set<Character> ss = new HashSet<>();
        for(end=0;end<s.length();end++)
        {
            char c = s.charAt(end);
            while(ss.contains(c))
            {
                ss.remove(s.charAt(start));
                start++;
            }
            ss.add(c);
            int windowSize = end-start+1;
            maxLen = Math.max(maxLen,windowSize);
        }
        return maxLen;
    }
}