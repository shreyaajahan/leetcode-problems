class Solution {
public:
    void backtrack(int start,vector<int>&candidates,int target,vector<vector<int>>&res,vector<int>&curr)
    {
        if(target<0) return;
        if(target==0)
        {
            res.push_back(curr);
            return;
        }
        for(int i=start;i<candidates.size();i++)
        {
            if(i>start && candidates[i-1]==candidates[i]) continue;
            curr.push_back(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],res,curr);
            curr.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        vector<vector<int>>res;
        vector<int>curr;
        backtrack(0,candidates,target,res,curr);
        return res;
    }
};