class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = (nums.length) * 2;
        int m = nums.length;
        int ans[] = new int[n];
        int index = 0;
        int loc = 0;
        for(int i=0; i<m; i++)
        {
            ans[i] = nums[i];
            index = i;
        }
        index++;
        for(int i=index; i<n; i++)
        {
            ans[i] = nums[loc];
            loc++;
        }
        return ans;
    }
}