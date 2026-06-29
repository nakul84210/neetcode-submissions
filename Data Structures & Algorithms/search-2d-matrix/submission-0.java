class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
