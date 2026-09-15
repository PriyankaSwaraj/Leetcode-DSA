class Solution {
    public int minCostClimbingStairs(int[] cost) {
    int n=cost.length,a=cost[0],b=cost[1];
    for(int i=2;i<n;i++)
    {
        int c=Math.min(a,b)+cost[i];
        a=b;
        b=c;
    } 
    return Math.min(a,b);   
    }
}