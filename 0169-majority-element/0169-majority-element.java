class Solution {
    public int majorityElement(int[] nums) {
        int voter = nums[0];
        int voteCount = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==voter) voteCount++;
            else if(nums[i]!=voter) voteCount--;
            if(voteCount==0)
            {
                voter=nums[i];
                voteCount=1;
            }
        }
        return voter;
    }
}