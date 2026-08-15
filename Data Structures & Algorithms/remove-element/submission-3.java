class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] temp = new int[n];
        int idx = 0, cnt = 0;
        for(int num:nums)
        {
            if(num != val)
            {
                temp[idx] = num;
                idx++;
                cnt++;
            }
        }
        for(int i=0; i<temp.length; i++)
        {
            nums[i] = temp[i];
        }
        return cnt;
    }
}