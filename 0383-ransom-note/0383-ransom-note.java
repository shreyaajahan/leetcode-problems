class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            char ch = magazine.charAt(i);
            freq1[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch = ransomNote.charAt(i);
            if(freq1[ch-'a']==0) return false;
            else freq1[ch-'a']--;
        }
        return true;
    }
}