class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for(int i=0; i<s.length(); i++)
        {
            int cnt = 0;
            Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++)
            {
                char c = s.charAt(j);
                if(set.contains(c))
                {
                    break;
                }
                set.add(c);
                cnt++;
                maxLen = Math.max(maxLen, cnt);
            }
        }
        return maxLen;
    }
}
