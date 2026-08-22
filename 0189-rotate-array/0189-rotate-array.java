class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        Reverse(arr,0,n-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
    }
    public void Reverse(int[]nums,int start,int end)
    {
        while(start<end)
        {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }
}