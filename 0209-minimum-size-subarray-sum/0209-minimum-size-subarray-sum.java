class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int CurrSum=0,window=Integer.MAX_VALUE;
        int start=0;

        for(int i=0;i<nums.length;i++)
        {
            CurrSum+=nums[i];
            while(CurrSum>=target)
            {
                window=Math.min(window,i-start+1);
                CurrSum-=nums[start];
                start++;
            }
        }
        return window==Integer.MAX_VALUE ? 0:window;
    }
}