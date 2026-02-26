class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
    boolean[] freq=new boolean[51];
    int m=ranges.length;
    for(int i=0;i<m;i++)
    {
        for(int j=ranges[i][0];j<=ranges[i][1];j++)
        {
            freq[j]=true;
        }
    }    
    for(int i=left;i<=right;i++)
    {
        if(!freq[i])
        {
            return false;
        }
    }
    return true;
    }
}