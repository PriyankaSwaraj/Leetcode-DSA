class Solution {
    public int[] findDegrees(int[][] matrix) {
    int n=matrix.length;
    int[] degree=new int[n];
    for(int i=0;i<n;i++)
    {
        int j=0;
        while(j<=i)
        {
            if(matrix[i][j]==1)
            {
                degree[i]++;
                degree[j]++;
            }
            j++;
        }
    }    
    return degree;
    }
}