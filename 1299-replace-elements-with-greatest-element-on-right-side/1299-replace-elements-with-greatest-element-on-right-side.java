class Solution {
    public int[] replaceElements(int[] arr) {
        int maxval = -1;
        for(int i=arr.length-1;i>=0;i--) {
            int currval = arr[i];
            arr[i] = maxval;
            maxval = Math.max(maxval,currval);
        }
        return arr;
    }
}