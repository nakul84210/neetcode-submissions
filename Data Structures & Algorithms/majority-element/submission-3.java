class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n/2;
        for(int i=0; i<n; i++)
        {
            int cnt = 0;
            for(int j=i; j<n; j++)
            {
                if(nums[i] == nums[j])
                {
                    cnt++;
                }
                if(cnt >= majority)
                {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}