class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int l1= word1.length();
        int l2= word2.length();
        int i=0;
        while(l1 != 0 && l2 != 0)
        {
            res+=word1.charAt(i);
            l1--;
            res+=word2.charAt(i);
            l2--;
            i++;
        }
        if(l1 != 0)
        {
        while(l1 != 0)
        {
            res+=word1.charAt(i);
            l1--;
            i++;
        }
        }
        if(l2!=0)
        {
        while(l2 != 0)
        {
            res+=word2.charAt(i);
            l2--;
            i++;
        }
        }
        return res;
    }
}