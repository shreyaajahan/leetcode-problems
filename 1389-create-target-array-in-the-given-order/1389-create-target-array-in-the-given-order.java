class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> TargetList = new ArrayList<>();

        for(int i=0;i<index.length;i++){
            TargetList.add(index[i],nums[i]);
        }
        int target[] = new int[TargetList.size()];
        for(int i=0;i<target.length;i++){
            target[i] = TargetList.get(i);
        }
        return target;
    }
}