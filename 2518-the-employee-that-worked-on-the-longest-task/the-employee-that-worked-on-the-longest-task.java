class Solution {
    public int hardestWorker(int n, int[][] logs) {
    int m=logs.length;
    int time=logs[0][1],id=logs[0][0];
    for(int i=1;i<m;i++)
    {
        int num=logs[i][1]-logs[i-1][1];
        if(num>time)
        {
          time=num;
          id=logs[i][0];
        }
        else if(num==time)
        {
            id=Math.min(id,logs[i][0]);
        }
    }
    return id; 
    }
}