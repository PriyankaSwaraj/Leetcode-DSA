class Solution {
    public int oddCells(int m, int n, int[][] indices) {
    int[][] arr=new int[m][n];
    int m1=indices.length;
    for(int l=0;l<m1;l++)
    {
        int i=indices[l][0],j=indices[l][1];
        for(int k=0;k<n;k++)
        {
            arr[i][k] += 1;
        }
        for(int k=0;k<m;k++)
        {
            arr[k][j] += 1;
        }
    
    }
    int count=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[i][j]%2!=0)
            {
                count++;
            }
        }
    }
    return count; 
    }
}