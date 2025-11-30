class Solution {
public:
int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0; // should not reach here for valid input
    }
    int romanToInt(string s) {
        int res = 0;
        for(int i=0;i<(int)s.size();i++)
        {
           int curr = value(s[i]);
           if(i+1<(int)s.size() && curr<value(s[i+1]))
           {
            res-=curr;
           }
           else
           {
            res+=curr;
           }
        }
        return res;
    }
};
