int removeElement(int* nums, int n, int val) {
    int i=0;
    for(int j=0;j<n;j++)
    {
        if(nums[j] != val)
        {
            nums[i]=nums[j];
            i++;
        }
    }
    return i;
}