class Solution {
    public int trap(int[] height) {
         int[] left = new int[height.length];
         int[] right = new int[height.length];
         int result = 0;
         int max=-1;
         for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
            left[i]=max;   
         }
         max=-1;
         for(int i=height.length-1;i>=0;i--){
            if(height[i]>max){
                max=height[i];
            }
            right[i]=max;
         }
         for(int i=0;i<height.length;i++){
            result=result+Math.min(left[i],right[i])-height[i];
         }
         return result;
    }
}