class Solution {
public:
    int longestConsecutive(vector<int>& a) {
        unordered_set<int> s;
        int ml=0;
        for(auto e :a)
        {
            s.insert(e);
        }
        for(auto ele:a)
        {
            if(!s.count(ele-1))
            {
                int cn=ele;
                int cc=1;
                while(s.count(cn+1))
                {
                cc=cc+1;
                cn=cn+1;
            }
            ml=max(cc,ml);
            }
        }
        return ml;
    }
};