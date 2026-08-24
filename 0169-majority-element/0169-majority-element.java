class Solution {
    public int majorityElement(int[] nums) {
        int voter = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==voter) count++;
            else if(nums[i]!=voter) count--;
            if(count==0) 
            {
                voter=nums[i];
                count++;
            }
        }
        return voter;
    }
}