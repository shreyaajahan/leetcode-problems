class Solution {
public:
    int solve(int i,vector<int>&cost,vector<int>&dp)
    {
        if(i>=cost.size())
             return 0;
        if(dp[i]!=-1) 
              return dp[i];
        else 
             return dp[i]= cost[i]+min(solve(i+1,cost,dp),solve(i+2,cost,dp));

    }
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size()-1;
        vector<int>dp(n+1,-1);
        return min(solve(0,cost,dp),solve(1,cost,dp));
    }
};