class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int res = 0;
        for(int i=0; i<weights.length; i++)
        {
            res = Math.max(res,weights[i]);
        }
        while(true)
        {
            int ships = 1;
            int cap = res;
            for(int weight:weights)
            {
                if(cap-weight < 0)
                {
                    ships++;
                    cap = res;
                }
                cap = cap-weight;
            }
            if(ships <= days)
            {
                return res;
            }
                res++;
        }   
    }
}