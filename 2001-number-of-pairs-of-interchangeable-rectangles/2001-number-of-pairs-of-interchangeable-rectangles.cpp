class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rectangles) {
        long long pc = 0;
        unordered_map<double,int> m;
        for(auto rec:rectangles)
        {
            double ratio = (double)rec[0]/rec[1];
            pc+=m[ratio];
            m[ratio]+=1;
        }
        return pc;
    }
};