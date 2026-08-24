class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        int length = 1;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                length = 1;
                while(set.contains(num+length)) length++;
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}