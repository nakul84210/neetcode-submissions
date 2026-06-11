class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int num:nums)
        {
            st.add(num);
        }
        for(int i=1; i<=n+1; i++)
        {
            if(!st.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}