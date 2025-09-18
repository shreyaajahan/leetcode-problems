class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxlen = 0;
        int currlen= 0;

        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==1)
            {
                currlen +=1;
                maxlen = max(maxlen,currlen);
            }
            else
            {
                currlen=0;
            }
        }
        return maxlen;
    }
};