class Solution {
    public void sortColors(int[] nums) {
        int one = 0, two = 0, three = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                one++;
            else if(nums[i] == 1)
                two++;
            else
                three++;
        }
        int ptr = 0;
        while(ptr < nums.length)
        {
            if(one != 0)
            {
                nums[ptr] = 0;
                ptr++;
                one--;
            }
            else if(two != 0)
            {
                nums[ptr] = 1;
                ptr++;
                two--;
            }
            else
            {
                nums[ptr] = 2;
                ptr++;
                three--;
            }
        }
    }
}