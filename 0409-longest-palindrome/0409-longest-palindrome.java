class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> ss = new HashSet<>();
        int length = 0;
        for(char ch:s.toCharArray()){
            if(ss.contains(ch)){
                ss.remove(ch);
                length+=2;
            }
            else{
            ss.add(ch);
            }
        }
        if(!ss.isEmpty()) length+=1;
        return length;
    }
}