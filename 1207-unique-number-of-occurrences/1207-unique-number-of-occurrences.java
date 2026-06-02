class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:arr)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }
        Set<Integer> ss = new HashSet<>();
        for(int num:count.values())
        {
            if(!ss.add(num))
            {
                return false;
            }
        }
        return true;
    }
}