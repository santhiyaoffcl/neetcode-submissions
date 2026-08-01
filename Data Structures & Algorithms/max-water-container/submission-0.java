class Solution {
    public int maxArea(int[] heights) {
    int left = 0;
    int right = heights.length - 1;
    int maxArea = 0;
    while(left < right){
        int width = right - left;
        int currentHeight = Math.min(heights[left],heights[right]);
        int currentWater = width * currentHeight;
        maxArea = Math.max(maxArea,currentWater);
        if(heights[left] < heights[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return maxArea;
    
    }
}
