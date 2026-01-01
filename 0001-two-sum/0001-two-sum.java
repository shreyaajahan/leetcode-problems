class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int diff = target-nums[i];
            if(m.containsKey(diff) && m.get(diff)!=i)
            {
                return new int[]{i,m.get(diff)};
            }
        }
        return new int[]{};
    }
}