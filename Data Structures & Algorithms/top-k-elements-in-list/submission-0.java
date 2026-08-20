class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:nums)
        {
            count.put(num, count.getOrDefault(num,0)+1);
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++)
        {
            int max = 0;
            int element = 0;
            for(int num:count.keySet())
            {
                if(count.get(num) > max)
                {
                    max = count.get(num);
                    element = num;
                }
            }
            ans[i] = element;
            count.remove(element);
        }
        return ans;
    }
}
