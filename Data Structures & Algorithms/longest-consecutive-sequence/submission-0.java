class Solution {
    public int longestConsecutive(int[] nums) {
      int maxlen = 1;
      Arrays.sort(nums);
      int n = nums.length;
      int cnt = 1;
      if(n == 0)
      return 0;
      for(int i=1; i<n; i++)
      {
        if(nums[i] == nums[i-1])
        {
            continue;
        }
        else if (nums[i] == nums[i-1]+1)
        {
            cnt++;
        }
        else
        {
            maxlen = Math.max(maxlen, cnt);
            cnt = 1;
        }
      }  
      return Math.max(maxlen, cnt);
    } 
}
