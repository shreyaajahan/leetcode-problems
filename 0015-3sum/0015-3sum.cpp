class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;

        for (int i = 0; i < nums.size() - 2; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {  // skip duplicates
                twoSumII(nums, i, res);
            }
        }
        return res;   // ✅ moved outside loop
    }

private:
    void twoSumII(vector<int>& nums, int i, vector<vector<int>>& res) {
        int lo = i + 1, hi = nums.size() - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                lo++;
            } else if (sum > 0) {
                hi--;
            } else {
                res.push_back({nums[i], nums[lo++], nums[hi--]});
                while (lo < hi && nums[lo] == nums[lo - 1]) lo++;  // skip duplicates
            }
        }
    }
};
