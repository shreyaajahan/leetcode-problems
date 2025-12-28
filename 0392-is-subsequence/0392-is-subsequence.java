class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int j = 0;
        for(int i=0;i<t.length();i++)
        {
            if(j<s.length() && t.charAt(i)==s.charAt(j))
            {
             count++;
             j++;
            }
        }
        if(count==s.length()) return true;
        else return false;
    }
}