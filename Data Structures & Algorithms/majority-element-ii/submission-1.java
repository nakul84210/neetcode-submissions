class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        while(i < n)
        {
            int j = i+1;
            while(j < n && nums[i] == nums[j])
            {
                j++;
            }
            if(j -i > n/3)
            {
                ans.add(nums[i]);
            }
            i = j;
        }
        return ans;
    }
}