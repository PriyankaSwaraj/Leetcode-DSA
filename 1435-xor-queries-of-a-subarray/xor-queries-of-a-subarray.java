class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
    int n=arr.length,m=queries.length;
    int[] x=new int[n];
    int[] result=new int[m];
    x[0]=arr[0];
    for(int i=1;i<n;i++)
    {
        x[i]=x[i-1]^arr[i];
    }
    for(int i=0;i<m;i++)
    {
        int a=queries[i][0],b=queries[i][1];
        if(a>0)
        {
            result[i]=x[a-1]^x[b];
        }
        else{
            result[i]=x[b];
        }
    }
    return result;
    }
}