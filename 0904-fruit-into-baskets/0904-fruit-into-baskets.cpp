class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int r = 0,l=0,res=0,n=fruits.size();
        unordered_map<int,int> m;

        for(int r=0;r<n;r++)
        {
            m[fruits[r]]++;
            if(m.size()>2)
            {
                m[fruits[l]]--;
                if(m[fruits[l]]==0) m.erase(fruits[l]);
                l++;
            }
            res=max(res,r-l+1);
        }
        return res;
    }
};