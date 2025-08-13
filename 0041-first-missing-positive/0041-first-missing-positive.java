class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> ss = new HashSet<>();
        for(int num:nums){
            ss.add(num);
        }
        int smallest = 1;
        while(true){
        if(!ss.contains(smallest)){
            return smallest;
        }
        smallest++;
        }
    }
}