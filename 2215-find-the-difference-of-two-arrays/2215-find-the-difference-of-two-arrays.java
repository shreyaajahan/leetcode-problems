class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int num:nums2){
            s2.add(num);
        }
        List<Integer> diff1 = new ArrayList<>();
        for(int num:s1){
            if(!s2.contains(num))
            diff1.add(num);
        }

        List<Integer> diff2 = new ArrayList<>();
        for(int num:s2){
            if(!s1.contains(num))
            diff2.add(num);
        }

        result.add(diff1);
        result.add(diff2);
        
        return result;
    }
}