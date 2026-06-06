class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = Math.min(s.length(),1);
        HashSet<Character> set  = new HashSet<>();
        for(right=0;right<s.length();right++)
        {
           char ch = s.charAt(right);
           while(set.contains(ch))
           {
            set.remove(s.charAt(left));
            left++;
           }
           set.add(ch);
           int window = right-left+1;
           maxLen=Math.max(window,maxLen);
        }
        return maxLen;
    }
}