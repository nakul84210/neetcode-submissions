class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int l = 0, r = 0;
        int n = word1.length();
        int m = word2.length();
        while(l<n && r<m)
        {
            ans.append(word1.charAt(l++));
            ans.append(word2.charAt(r++));
        }
        ans.append(word1.substring(l));
        ans.append(word2.substring(r));
        return ans.toString();
    }
}