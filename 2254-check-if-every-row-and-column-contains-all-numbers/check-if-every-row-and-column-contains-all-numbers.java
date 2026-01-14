class Solution {
    public boolean checkValid(int[][] matrix) {
    int n=matrix.length;
    for(int i=0;i<n;i++)
    {
        HashSet<Integer> arr = new HashSet<Integer>();
        HashSet<Integer> arr1 = new HashSet<Integer>();
        for(int j=0;j<n;j++)
        {
            arr.add(matrix[i][j]);
            arr1.add(matrix[j][i]);
        }
        for(int j=1;j<=n;j++)
        {
        if(!arr.contains(j)||!arr1.contains(j))
          {
            return false;
          }
        }
    }    
    return true;
    }
}