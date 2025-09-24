class Solution {
public:
    void backtrack(int start,vector<int>&arr,vector<vector<int>>&res,vector<int>&curr,int k,int target)
    {
        if(target<0) return;
        if(target==0 && k==0)
        {
            res.push_back(curr);
            return;
        }
        if(target<0||target>9||target==0 && k>0)
        {
            return;
        }
        for(int i=start;i<arr.size();i++)
        {
            if(i>start && arr[i-1]==arr[i]) continue;
            curr.push_back(arr[i]);
            backtrack(i+1,arr,res,curr,k-1,target-arr[i]);
            curr.pop_back();
        }
    }
    vector<vector<int>> combinationSum3(int k, int target) {
        vector<int> arr = {1,2,3,4,5,6,7,8,9};
        vector<vector<int>> res;
        vector<int> curr;
        backtrack(0,arr,res,curr,k,target);
        return res;
    }
};