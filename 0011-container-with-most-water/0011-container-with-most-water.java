class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea = Math.abs(height[l]-height[r])*(l-r);
        while(l<r){
            maxArea = Math.max(Math.min(height[l],height[r])*(r-l), maxArea);
            if(height[l]<height[r])l++;
            else r--;
        }
        return maxArea;
    }
}