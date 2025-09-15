class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& r) {
        long long pc = 0;
        unordered_map<double,int>m;
        for(auto i:r)
        {
            double ratio = (double)i[0]/i[1];
            pc = pc+ m[ratio];
            m[ratio] = m[ratio]+1;
        }
        return pc;
    }
};