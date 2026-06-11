class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int missing = 1;
        for(int num:nums)
        {
            if(num < missing)
            {
                continue;
            }
            if(num == missing)
            {
                missing++;
            }
            else if(num > missing)
            {
                return missing;
            }
        }
        return missing;
    }
}