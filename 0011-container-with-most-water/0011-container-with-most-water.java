class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxAreaa=0;
        while(left<right){
            int h=Math.min(height[right],height[left]);
            maxAreaa=Math.max(((right-left)*h),maxAreaa);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAreaa;
    }
}