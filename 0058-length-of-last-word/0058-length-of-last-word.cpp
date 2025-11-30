class Solution {
public:
    int lengthOfLastWord(string s) {
        int p = size(s)-1,count=0;
        while(p>=0)
        {
            if(s[p]!=' ') ++count;
            else if(count>0) break;
            --p;
        }
        return count;
    }
};