class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n=grid.length;
    int[] arr=new int[2];
    int[] frequency=new int[n*n+1];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            frequency[grid[i][j]]++;
        }
    }
    for(int i=1;i<=n*n;i++)
    {
        if(frequency[i]>1)
        {
            arr[0]=i;
        }
        if(frequency[i]==0)
        {
            arr[1]=i;
        }
    }
    return arr;
    }
}