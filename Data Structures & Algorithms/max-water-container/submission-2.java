class Solution {
    /*
    brute force
        int maxarea =0;
        int n = height.length;
        for(int i=0;i<n;i++){
        for(int j = i+1;j<nj++){
        int width = j-i;
        int currheight = Math.min(height[i],height[j]);
        int area = width*currheight;
        maxarea= Math.max(maxarea,area);
        }
        return maxarea;
        }
        */
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left=0;
        int right = heights.length-1;
        while(left < right){
            int max = Math.min(heights[left],heights[right])*(right-left);
            maxArea = Math.max(max,maxArea);
            if(heights[left]< heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}
