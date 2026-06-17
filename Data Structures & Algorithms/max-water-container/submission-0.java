class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int height = Math.min(heights[i], heights[j]);
                int width = j-i; 
                int area = height * width;
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
