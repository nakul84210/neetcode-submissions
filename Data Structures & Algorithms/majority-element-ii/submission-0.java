class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            int cnt = 0;
            for(int j=0; j<n; j++)
            {
                if(nums[i] == nums[j])
                {
                    cnt++;
                }
            }
            if(cnt > n/3)
            {
                if(lst.contains(nums[i]))
                {
                    continue;
                }
                else
                {
                    lst.add(nums[i]);
                }
            }
        }
        return lst;
    }
}