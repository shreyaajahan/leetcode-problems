class Solution {
    public void moveZeroes(int[] arr) {
        int left = 0;
        int right = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[right]!=0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
                left++;
            }
            else
            {
                right++;
            }
        }
    }
}