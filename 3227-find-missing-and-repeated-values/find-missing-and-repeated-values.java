class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n=grid.length;
    int[] arr=new int[2];
    HashSet<Integer> set =new HashSet<>();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(set.contains(grid[i][j]))
            {
                arr[0]=grid[i][j];
            }
            set.add(grid[i][j]);
        }
    } 
    int k=1;
    while(k<=n*n)
    {
        if(!set.contains(k))
        {
            arr[1]=k;
        }
        k++;
    } 
    return arr;
    }
}