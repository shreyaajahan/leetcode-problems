class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        Arrays.sort(nums);

        // value -> last index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Set<String> used = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {

                // skip duplicate j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int currSum = nums[i] + nums[j];
                int target = -currSum;

                if (map.containsKey(target)) {
                    int k = map.get(target);

                    // ensure distinct & ordered indices
                    if (k > j) {
                        String key = nums[i] + ":" + nums[j] + ":" + nums[k];

                        if (!used.contains(key)) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            used.add(key);
                        }
                    }
                }
            }
        }
        return result;
    }
}
