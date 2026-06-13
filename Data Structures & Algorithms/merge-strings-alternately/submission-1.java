class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int l = 0, r = 0;
        int n = word1.length();
        int m = word2.length();
        while(l<n || r<m)
        {
            if(l<n)
            {
                ans.append(word1.charAt(l++));
            }
            if(r<m)
            {
                ans.append(word2.charAt(r++));
            }
        }
        return ans.toString();
    }
}