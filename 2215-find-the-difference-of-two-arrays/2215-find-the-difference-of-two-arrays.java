class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        for(int num:nums1)
        {
            s1.add(num);
        }
        HashSet<Integer> s2 = new HashSet<>();
        for(int num:nums2)
        {
            s2.add(num);
        }
        List<Integer> res1 = new ArrayList<>();
        for(int num:s1)
        {
            if(!s2.contains(num)) res1.add(num);
        }
        List<Integer> res2 = new ArrayList<>();
        for(int num:s2)
        {
            if(!s1.contains(num)) res2.add(num);
        }
        result.add(res1);
        result.add(res2);
        return result;
    }
}